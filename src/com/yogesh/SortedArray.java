package com.yogesh;

import java.util.ArrayList;

public class SortedArray {

    public static void main(String[] args) {
        int[] nums= {3,5,5,6,5,1,2};
//        ArrayList arr= new ArrayList<Integer>();
      //  isSorted(nums,0,arr,3);
//       arr= findTargets(nums,0,3);
//        System.out.println(arr.toString());
        System.out.println(findTargetRotated(nums,5,0,nums.length-1));
    }

    static boolean isSorted(int[] nums, int i){
        if(i== nums.length-1){
            return true;
        }
        if(nums[i]<= nums[i+1]){
          return isSorted(nums,i+1);
        }
        return false;

    }

    static ArrayList<Integer> findTarget(int[] nums, int i, ArrayList<Integer> arr, int target){
        if(i== nums.length-1){
            return arr;
        }
        if(nums[i]== target){
           arr.add(i);
        }
        return findTarget(nums,i+1,arr,target);
    }

    // If we want to declare arraylist inside function body
    // return the list but don't take in arguments
    static ArrayList<Integer> findTargets(int[] nums, int i, int target){
        ArrayList arr= new ArrayList<>();
        if(i== nums.length-1){
            return arr;
        }
        if(nums[i]== target){
            arr.add(i);
        }
        ArrayList<Integer> answersFromBelowCalls=  findTargets(nums,i+1,target);
//        if(!arr.isEmpty()){
//            answersFromBelowCalls.addLast(i);
//        }
        answersFromBelowCalls.addAll(arr);
        return answersFromBelowCalls;
    }


    //find target element in rotated sorted array using recursion

    static int findTargetRotated(int[] nums,int target,int l,int r){
        if(l>r){
            return -1;
        }
        int mid= l+ (r-l)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]> nums[l]){
            if(target<nums[mid] && target>=nums[l]){
                r=mid-1;
            }else{
                l=mid+1;
            }

        }else if(nums[mid]<nums[r]){
            if(target>nums[mid] && target<=nums[r]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

        return  findTargetRotated(nums,target,l,r);
    }




}

