/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithams;

import java.util.Arrays;

//Space O(k)
//Run   O(n)
public class CountingSort {

    public static  void sort(int array[],int max){

        int count[]=new int[max+1];
        //create count array
        for(int element:array){
            count[element]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                array[k++]=i;
            }
        }

    }
    public static void main(String[] args) {
        int array[]={5,4,7,1,2};
        sort(array,7);
        System.out.println(Arrays.toString(array));
    }
 
}
