package com.yogesh;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args)
    {
        StringBuilder str=new StringBuilder("abc");
        List<String> ans=new ArrayList<>();
        permutation(str,ans,0);
        System.out.println(ans);
        perms("1234","");
    }

    public static void perms(String perm,String ans){

        if(perm.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<perm.length();i++){
            perms(perm.substring(0,i)+perm.substring(i+1),ans+ perm.charAt(i));
        }
    }


    public static void swap(StringBuilder str,int i,int j)
    {
        char temp=str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }
    public static void permutation(StringBuilder str,List<String>ans,int idx)
    {
        if(idx==str.length())
        {
            ans.add(str.toString());
            return;
        }
        for(int i=idx;i<str.length();i++)
        {
            swap(str,i,idx);
            permutation(str,ans,idx+1);
            swap(str,i,idx);
        }
    }
}
