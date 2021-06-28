package sortingalgorithams;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Space = O(n+k)
//Runtime           Best        Worse
//Distribution      O(n)        O(n)
//Iterating Buckets O(k)        O(k)
//Sorting           O(1)        O(n*n)
//                  O(n)        O(n*n)
public class BucketSort {
    public static void sort(int array[],int numberOfBuckets){
        List<List<Integer>> buckets=new LinkedList<>();
        for(int i=0;i<numberOfBuckets;i++){
            buckets.add(new LinkedList<>());
        }
        for(int item:array){
            buckets.get(item/numberOfBuckets).add(item);
        }
        int size=0;
        for(List<Integer> bucket:buckets){
            Collections.sort(bucket);
            for(int items:bucket){
                array[size++]=items;
            }
        }


    }

    public static void main(String[] args) {
        int array[]={1,7};
        sort(array,3);
        System.out.println(Arrays.toString(array));
    }
}
