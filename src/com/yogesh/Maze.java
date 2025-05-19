package com.yogesh;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        int[][] arr=new int[][]{{0,0,0},{-1,-1,0},{0,0,0}};
//        System.out.println( maze("",0,0,arr));
//        System.out.println( mazeDiagonal("",0,0,arr));
        int[][] arr1=new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        mazeAll("",0,0,arr1);
        System.out.println(Arrays.deepToString(arr1));
    }
    public static int maze(String path,int i,int j,int[][] arr){

        if(i== arr.length || j== arr[0].length){
            return 0;
        }

        if(i== arr.length-1 && j== arr[0].length-1){
            System.out.println(path);
            return 1;
        }

       int left= maze(path+"r",i,j+1,arr);
        int right= maze(path+"d",i+1,j,arr);
        arr[i][j]=right+left;
        return arr[i][j];

    }

    public static int mazeDiagonal(String path,int i,int j,int[][] arr){

        if(i== arr.length || j== arr[0].length){
            return 0;
        }
        if(arr[i][j]==-1){
            return 0;
        }

        if(i== arr.length-1 && j== arr[0].length-1){
            System.out.println(path);
            return 1;
        }

        int left= mazeDiagonal(path+"r",i,j+1,arr);
        int right= mazeDiagonal(path+"d",i+1,j,arr);
        int cross=0;
        cross= mazeDiagonal(path+"c",i+1,j+1,arr);
        arr[i][j]=right+left+cross;
        return arr[i][j];

    }

    public static int mazeAll(String path,int i,int j,int[][] arr){

        if(i==-1 || j==-1 || i== arr.length || j== arr[0].length){
            return 0;
        }



        if(i== arr.length-1 && j== arr[0].length-1){
            System.out.println(path);
            return 1;
        }
        if(arr[i][j]==-1){
            return 0;
        }
        arr[i][j]=-1;
        int right= mazeAll(path+"r",i,j+1,arr);

        int down= mazeAll(path+"d",i+1,j,arr);

        int left= mazeAll(path+"l",i,j-1,arr);

        int up= mazeAll(path+"u",i-1,j,arr);

//        int upLeft= maze(path+"q",i-1,j-1,arr);
//
//        int downRight= maze(path+"m ",i+1,j+1,arr);
        arr[i][j]=0;
        arr[i][j]=right+left+down+up;

        return arr[i][j];

    }
}
