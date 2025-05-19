package com.yogesh;

import java.util.Arrays;

public class StarPatterns {

    public static void main(String[] args) {
//        printPattern2(3,3);
    int[] nums={5,4,3,2,1};
//        bubbleSort(nums, nums.length -1,0);
        selectionSort(nums, nums.length,0,0);
        System.out.println(Arrays.toString(nums));

    }
    static void printPattern(int r, int c){
        if(r==0){
            return;
        }
        if(c>0){
            System.out.print("*");
            printPattern(r,c-1);
        }else{
            System.out.println();
            r--;
            c=r;
            printPattern(r,c);
        }
    }
    static void printPattern2(int r, int c){
        if(r==0){
            return;
        }
        if(c>0){
            printPattern2(r,c-1);
            System.out.print("*");
        }else{
            r--;
            c=r;
            printPattern2(r,c);
            System.out.println();
        }



    }

    static void bubbleSort(int[] nums,int i,int j){

        if( i<1 ){
            return;
        }
        if(j< i){
            if(nums[j]>nums[j+1]){
                swap(nums, j, j + 1);
            }
            bubbleSort(nums,i,j+1);
        }else{
            bubbleSort(nums,i-1,0);
        }


    }

    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    static void selectionSort(int[] nums,int i,int j,int max){

        if( i<1 ){
            return;
        }
        if(j<i){
            if(nums[max]<nums[j]){
                max=j  ;
            }
            selectionSort(nums,i,j+1,max);
        }else{
            swap(nums,max,i-1);
            selectionSort(nums,i-1,0,0);
        }


    }
}

