package com.yogesh;

public class Permutation {
    public static void main(String[] args) {
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
}
