/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithams;

import java.util.Arrays;
// run time complexity
//                          Best                                    Worst
// Passes                   O(n)                                    O(n)
// Comparisons              O(n)                                    O(n)
//                          O(n*n) Quadratic                        O(n*n) Quadratic

public class SelectionSort {
    
    public void selectionSort(int array[]){
        int temp;
        for(int i=0;i<array.length;i++){
            int minIndex=i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j; 
                }
            }
            temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }
    
    public static void main(String[] args) {
        int array[]={2,5,14,6,7};
        SelectionSort s1=new SelectionSort();
        s1.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
