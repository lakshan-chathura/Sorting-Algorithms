package sortingalgorithams;

import java.util.Arrays;

// run time complexity
//                          Best                                    Worst
// Dividing                 O(log n)                                O(log n)
// Merging                  O(n)                                    O(n)
//                          O(nlog n)                               O(nlog n)
public class MergeSort {

    public static void sort(int array[]){
        if (array.length < 2)
            return;
        int middile=array.length/2;
        
        int left[]=new int[middile];
        for(int i=0;i<middile;i++){
            left[i]=array[i];
        }
        
        int right[]=new int[array.length-middile];
        for(int i=middile;i<array.length;i++){
            right[i-middile]=array[i];
        }
        sort(left);
        sort(right);
        merge(left, right, array);
    }
    
    public static void merge(int left[],int right[],int result[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
               result[k++]=left[i++];
            }else{
                result[k++]=right[j++];
            }
          
        }
        //adding remaining item from left array to original
        while(i<left.length){
             result[k++]=left[i++];
        }
        //adding remaining item from right array to original
        while(j<right.length){
            result[k++]=right[j++];
        }
        
    }
  
    public static void main(String args[]){
    int array[]={1,5,3,14,55};
    sort(array);
    System.out.println(Arrays.toString(array));
    
    }
}
