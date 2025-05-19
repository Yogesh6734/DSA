package com.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] sortedArray= {1,2,3,4,5,6,7,8};
        System.out.println("Enter target element: ");
        int target = scanner.nextInt();
        int left=0;
        int right= sortedArray.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (sortedArray[mid]< target){
                left=mid+1;
            } else if ( sortedArray[mid]> target) {
                right=mid-1;
            }else{
                System.out.println("target found at index: "+ mid);
                return;
            }
        }
        System.out.println("target not found");
    }
}
