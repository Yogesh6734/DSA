package com.yogesh;

public class CeilingValue {
    public static void main(String[] args) {
        int[] arr= {12,14,15,18,19,20,22,24,30};
        int target= 31;
        System.out.println(ceilingValue(arr,target));
        System.out.println(floorValue(arr,target));
    }

    public static int ceilingValue(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        int ans=0;
        while(left<=right){
            int mid= left +(right-left)/2;
            if(arr[mid]> target){
                right=mid-1;
                ans= arr[mid];
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                return arr[mid];
            }
        }
        return ans;
    }

    public static int floorValue(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        int ans=0;
        while(left<=right){
            int mid= left +(right-left)/2;
            if(arr[mid]> target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
                ans= arr[mid];
            }else{
                return arr[mid];
            }
        }
        return ans;
    }
}
