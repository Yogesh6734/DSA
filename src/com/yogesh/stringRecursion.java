package com.yogesh;

import java.util.ArrayList;
import java.util.List;

public class stringRecursion {
    public static void main(String[] args) {
        String s= "abcdcaada";
//        System.out.println(removeA(s));
//         ArrayList list=new ArrayList<>();
//        printSubsets("abc","");
//        System.out.println(printSubsets("abc","").toString());

//        System.out.println(subSetIteration(new int[]{1,2,3}));
        permutations("abcd","");
        System.out.println(perm.toString());
        System.out.println(count);
    }

    static String removeA(String s){
        if(s.length()==0){
            return s;
        }

        if(s.charAt(0)=='d'){
           return removeA(s.substring(1));
        }else{
            return s.charAt(0)+ removeA(s.substring(1));
        }
    }

    static ArrayList<String> printSubsets(String s,String ans){
        ArrayList<String> list=new ArrayList<>();
        if(s.length()==0){

            list.add(ans);
            return list;
        }

       ArrayList<String> left= printSubsets(s.substring(1),ans+s.charAt(0));
        ArrayList<String> right = printSubsets(s.substring(1),ans);
        list.addAll(left);
        list.addAll(right);
        return list;
    }

    static List<List<Integer>> subSetIteration(int[] nums){

        ArrayList<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> list=new ArrayList<>(outer.get(i));
                list.add(num);
                outer.add(list);
            }
        }
        return outer;
    }
    static ArrayList<String> perm=new ArrayList<>();
    static int count=0;
    static void permutations(String s,String ans){

        if(s.length()==0){
            count++;
            perm.add(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            count++;
            permutations(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
        }


    }
}
