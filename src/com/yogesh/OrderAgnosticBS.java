package com.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= s.nextInt();
        System.out.println("Enter the target element: ");
        int target= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(orderAgnosticBS(arr,target));

    }

    public static int orderAgnosticBS(int[] arr,int target){
        int left= 0;
        int right= arr.length-1;
        boolean isAsc= arr[left]< arr[right];

        while(left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]== target){
                return mid;
            }
            if (isAsc){
                if (arr[mid]< target){
                    left=mid+1;
                } else if ( arr[mid]> target) {
                    right=mid-1;
                }
            }else{
                if (arr[mid]>target){
                    left=mid+1;
                } else if ( arr[mid]<target) {
                    right=mid-1;
                }
            }
        }
        return -1;
    }

}
