package sortingalgorithams;

import java.util.Arrays;
// run time complexity
//                          Best                                    Worst
// Partitioning             O(n)                                    O(n)
// # of times               O(log n)                                O(n)
//                          O(nlog n)                               O(n*n) Quadratic
public class QuickSort {
    private static int partition(int array[],int start,int end){

        int piviot=array[end];
        int boundry=start-1;
        for(int i=start;i<=end;i++){
            if(array[i]<=piviot){
                boundry++;
                int temp=array[i];
                array[i]=array[boundry];
                array[boundry]=temp;
            }
        }
        return boundry;
    }
    private static void sort(int array[],int start,int end){
        if(start>=end){
            return;
        }
        int piviotIndex=partition(array,start,end);
        //Left part
        sort(array,start,piviotIndex-1);

        //right part
        sort(array,piviotIndex+1,end);

    }
    public static void sort(int array[]){
        sort(array,0, array.length-1);
    }
    public static void main(String[] args) {
        int array[]={1,7,9,8,7,9,4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
