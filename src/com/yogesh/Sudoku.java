package com.yogesh;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {


        int[][] arr = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudoku(arr,0,0);
        System.out.println(Arrays.deepToString(copy));

    }
       static int[][] copy = new int[9][9];

        public static void sudoku(int[][] arr, int r, int c){



            for(int i=r;i<9;i++){
                for(int k=(i==r?c:0);k<9;k++){
                    if(arr[i][k]==0){
                        for(int j=1;j<=9;j++){
                            if(isSafe(arr,i,k, j)){
                                arr[i][k]=j;
                                sudoku(arr,r,k+1);
                                arr[i][k]=0;
                            }
                        }
                        if(arr[i][k]==0){
                            return;
                        }
                    }
                }
            }


            for (int i = 0; i < arr.length; i++) {
                copy[i] = Arrays.copyOf(arr[i], arr[i].length);
            }

        }
        public static boolean isSafe(int[][] arr,int r,int c, int target){

            for (int i = 0; i < 9; i++) {
                if (arr[r][i] == target || arr[i][c] == target) {
                    return false;
                }
            }


    //        int startRow = r - r % 3;
    //        int startCol = c - c % 3;

            int startRow= r/3;
            if(startRow==1){
                startRow=3;
            }else if (startRow==2){
                startRow=6;
            }

            int startCol= c/3;
            if(startCol==1){
                startCol=3;
            }else if (startCol==2){
                startCol=6;
            }

            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    if (arr[i][j] == target) {
                        return false;
                    }
                }
            }
            return true;
        }
}
