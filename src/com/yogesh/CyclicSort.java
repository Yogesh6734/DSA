package com.yogesh;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4,6};
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
               swap(arr,i, arr[i]-1);
            }else{
                i++;
            }


        }
            System.out.printf(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
