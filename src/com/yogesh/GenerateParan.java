package com.yogesh;

import java.util.ArrayList;
import java.util.List;

public class GenerateParan {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        generateParen(3,"",list,0,0);
        System.out.println(list);

    }
    public static void generateParen(int n,String s,List<String>list,int open,int closed){
        if(open==n && closed==n){
            list.add(s);
            return;
        }

        if(open<n  ){

            generateParen(n,s+"(",list,open+1,closed);
        }

        if(open>closed && closed<n){
            generateParen(n,s+")",list,open,closed+1);

        }




    }

}

