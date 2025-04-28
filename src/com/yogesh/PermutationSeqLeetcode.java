package com.yogesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationSeqLeetcode {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        String digits="234";
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

//        comb(0,digits,list,"",map);

//        dice("",4) ;
        System.out.println(dice1("",4));
    }

    public static void comb(int i, String digits,ArrayList<String> list,String ans, Map<Character,String> map){

        if(i==digits.length()){
            list.add(ans);
            return ;
        }
        for(int j=i;j<digits.length();j++){
            String a= map.get(digits.charAt(j));

            for(int k=0;k<a.length();k++){
                comb(i+1,digits,list, ans+a.charAt(k),map);
            }
        }
    }

    public static void dice(String ans,int target){
        if(target<=0){
            System.out.println(ans);
            return;
        }


        for(int j=1;j<=6 && j<=target;j++){
           dice(ans+j,target-j);
        }

    }

    public static void diceFace(String ans,int target,int face){
        if(target<=0){
            System.out.println(ans);
            return;
        }


        for(int j=1;j<=face && j<=target;j++){
            diceFace(ans+j,target-j,face);
        }

    }

    public static ArrayList<String> dice1(String ans,int target){
        ArrayList<String> list=new ArrayList<>();
        if(target<=0){
            list.add(ans);
            return list;
        }

        for(int j=1;j<=6 && j<=target;j++){
            list.addAll(dice1(ans+j,target-j));
        }
        return list;
    }
}
