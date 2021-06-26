/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithams;

import java.util.Arrays;

// run time complexity
//                          Best                                    Worst
// Iteration                O(n)                                    O(n)
// Shift items              O(1) array is already sorted            O(n) array is sorted in reverse order
//                          O(n) Linear                             O(n*n) Quadratic
public class InsertionSort {
    public static void sort(int array[]){
            //assuming 1st element of the array is right position
            for(int i=1;i<array.length;i++){
                int current=array[i];
                int j=i-1;
                while(j>=0 && array[j]>current){
                    array[j+1]=array[j];
                    j--;
                
                }
                array[j+1]=current;
            }
    }

    public static void main(String[] args) {
        int array[]={2,5,7,5,4,12};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
