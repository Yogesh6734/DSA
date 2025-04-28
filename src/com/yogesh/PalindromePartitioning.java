package com.yogesh;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s="aabb";
        List<List<String>> all=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        palindromePartitioning( s, all,0,list);
        System.out.println(all);
    }

    public static void palindromePartitioning(String s,List<List<String>> all,int start,ArrayList<String> list){
        if(s.length()==start){
            List<String> list1=new ArrayList<>(list);
           all.add(list1);

            return;
        }

        for(int i=start;i<s.length();i++){
           String a=s.substring(start,i+1);
            if(isPalindrome(a)){
                list.add(a);
                palindromePartitioning(s,all,i+1,list);
                list.remove(list.size()-1);
            }

        }

    }

    public static boolean isPalindrome(String a){
        int i=0,j=a.length()-1;
        while(i<=j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
