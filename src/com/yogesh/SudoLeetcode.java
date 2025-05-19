package com.yogesh;

import java.util.Arrays;

public class SudoLeetcode {

    static char[][] copy = new char[9][9];

    public void sudoku(char[][] arr, int r, int c){

        if(r==9 && c==9){
            System.out.println(Arrays.deepToString(arr));
            return;
        }

        for(int i=r;i<9;i++){
            for(int k=(i==r?c:0);k<9;k++){
                if(arr[i][k]=='0'){
                    for(int j=1;j<=9;j++){
                        if(isSafe(arr,i,k, j)){
                            arr[i][k]=(char)(j+'0');
                            sudoku(arr,r,k+1);
                            arr[i][k]='0';
                        }
                    }
                    if(arr[i][k]=='0'){
                        return;
                    }
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            copy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

    }
    public boolean isSafe(char[][] arr,int r,int c, int target){

        for (int i = 0; i < 9; i++) {
            char ch = (char)(target + '0');
            if (arr[r][i] == ch || arr[i][c] == ch) {
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
                if (arr[i][j] ==(char) (target+'0')) {
                    return false;
                }
            }
        }
        return true;
    }
}
