
package sortingalgorithams;

import java.util.Arrays;

public class BubbleSort {
 
// run time complexity
//                          Best                                    Worst
// Passes                   O(1)(array is already sorted)           O(n)(arrays is sorted in reverse order)
// Comparisons              O(n)                                    O(n)
//                          O(n) Linear                             O(n*n) Quadratic
static void bubbleSort(int arr[]){
    int temp=0;
    boolean isSorted;
    
    for(int i=0;i<arr.length;i++){
        isSorted=true;    //Code Optimization
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
               isSorted=false;
            }
        }
        if(isSorted){
            return;
        }
    }
}
   
    public static void main(String[] args) {
      int array[]={14,15,25,36,85,10,45,25};
      bubbleSort(array);
      System.out.println(Arrays.toString(array));
      
    }
    
}
