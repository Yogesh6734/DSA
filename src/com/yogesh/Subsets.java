package com.yogesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Subsets {
static int count;
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<List<Integer>> all=new ArrayList<>();
//        System.out.println( subsetSum(new int[]{1,2,4},list,0,0));
        int[] nums=new int[] {1,2,2};
//        System.out.println( subsets(nums,0,list));
//        Arrays.sort(nums);
//        subsetsDup(nums,0,list,all);
//        System.out.println(all);
        subSeq(new int[]{4, 2, 10, 5, 1, 3},5,0);
        System.out.println(count);

    }

    public static ArrayList<List<Integer>> subsets(int[] nums, int i, ArrayList<Integer> list){
      ArrayList<List<Integer>> all=new ArrayList<>();
        if(i==nums.length){
            ArrayList<Integer> list2=new ArrayList<>(list);
            all.add(list2);
            return all;
        }

        list.add(nums[i]);
       ArrayList<List<Integer>> left= subsets(nums,i+1,list);
       list.remove(Integer.valueOf(nums[i]));
        ArrayList<List<Integer>> right=subsets(nums,i+1,list);
        left.addAll(right);
        return left;

    }

    public static void subsetSum(int[] arr, ArrayList<Integer> list, int sum, int i) {
        if(i==arr.length){
            list.add(sum);
            return;
        }
        subsetSum(arr,list,sum+arr[i],i+1);
        subsetSum(arr,list,sum,i+1);
        return;

    }

    public static void subsetsDup(int[] nums, int i, ArrayList<Integer> list,ArrayList<List<Integer>> all){
        ArrayList<Integer> list2=new ArrayList<>(list);
        all.add(list2);
        for(int j=i;j<nums.length;j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            list.add(nums[j]);
            subsetsDup(nums, j + 1, list, all);
            list.remove(Integer.valueOf(nums[j]));
        }
    }
//
//    public static ArrayList<List<Integer>> subsetsDup(int[] nums, int i, ArrayList<Integer> list){
//        ArrayList<List<Integer>> all=new ArrayList<>();
//        if(i==nums.length){
//            ArrayList<Integer> list2=new ArrayList<>(list);
//            all.addLast(list2);
//            return all;
//        }
//
//        for(int j=i;j<nums.length;j++){
//            list.addLast(nums[i]);
//            ArrayList<List<Integer>> left= subsetsDup(nums,i+1,list);
//            list.remove(Integer.valueOf(nums[i]));
//            ArrayList<List<Integer>> right=subsetsDup(nums,i+1,list);
//            left.addAll(right);
//        }
//
//        return left;
//
//    }



  static void subSeq(int[] nums, int target,int start){

        if(target==0){
            count++;
            return;
        }
        if(start== nums.length || target<0 ){
            return;
        }
      if (nums[start] > target) {
          return;
      }

        subSeq(nums,target-nums[start],start+1);
        subSeq(nums,target,start+1);


    }
}

