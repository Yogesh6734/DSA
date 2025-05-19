package com.BinarySearch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        int currentSum=nums[0];
        int maxSum= nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum= Math.max(nums[i],currentSum+=nums[i]);
            System.out.println(currentSum+" "+i);
            maxSum= Math.max(currentSum,maxSum);
            System.out.println(maxSum);
        }
    }
}