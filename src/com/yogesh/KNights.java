package com.yogesh;

import java.util.ArrayList;
import java.util.List;

public class KNights {
    public static void main(String[] args) {
        int n=3;
        int k=2;
        List<List<Integer>> list= new ArrayList<>();
        int[][] arr=new int[n][n];
        System.out.println( nights(arr,k,0,0,list));
        System.out.println(list.toString());


    }

    public static int nights(int[][] arr,int k,int r, int c, List<List<Integer>> list){


        if(k==0){
          for(int i=0;i< arr.length;i++){
              for(int j=0;j<arr[0].length;j++){
                  System.out.print(arr[i][j]+" ");
              }
              System.out.println();
          }
            System.out.println();

            return 1;
        }

        int count=0;
        for(int i=r;i<arr.length;i++){
            for(int j=(i==r?c:0);j<arr[0].length;j++){
                if(isSafe(arr,i,j)){
                    arr[i][j]=1;
                    count+=nights(arr,k-1,i,j+1,list);
                    arr[i][j]=0;
                }
            }
        }
        return count;
    }

    public static boolean isSafe(int[][] arr,int r,int c){
        int col=arr[0].length;
            if(arr[r][c]==1) return false;
            if(r-2 >=0 && c-1>=0 && arr[r-2][c-1]==1) return false;
            if(r-2 >=0 && c+1<col && arr[r-2][c+1]==1) return false;
            if(r-1 >=0 && c-2>=0 && arr[r-1][c-2]==1) return false;
            if(r-1 >=0 && c+2<col && arr[r-1][c+2]==1) return false;

        return true;
    }
}
