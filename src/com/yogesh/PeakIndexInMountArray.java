package com.yogesh;

public class PeakIndexInMountArray {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,2,1,0};
        int index=peakIndexInMountainArray(arr);
        System.out.println(index);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            if((mid >0) && (arr[mid]>arr[mid-1]) && (arr[mid]> arr[mid+1])){
                return mid;
            }else if(arr[mid]> arr[mid+1]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;

    }
}
