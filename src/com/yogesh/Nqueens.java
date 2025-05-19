package com.yogesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {
    public static void main(String[] args) {
        List<List<String>> list= new ArrayList<>();
        int n=4;
        char[][] arr=new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        nQueens(4,0,arr,  list);
        System.out.println(list.toString());
    }
  public static void nQueens(int n,int r,char[][] arr, List<List<String>> list){

      if (r == n) {
          List<String> temp = new ArrayList<>();
          for (int i = 0; i < arr.length; i++) {
              temp.add(String.valueOf(arr[i]));
          }
          list.add(temp);
          return;
      }

      for(int i=0;i<arr[0].length;i++){
            if(isSafe(arr,r,i)) {
                arr[r][i] = 'Q';
                nQueens(n,r+1,arr,list);
                arr[r][i]='.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
//
//        for (int i = 1; i <= row; i++) {
//            if (board[row - i][col] == 'Q') return false;
//            if (col - i >= 0 && board[row - i][col - i] == 'Q') return false;
//            if (col + i < n && board[row - i][col + i] == 'Q') return false;
//        }
        return true;
    }

}

// Recurrence relation T(N)= N*T(N-1) + O(N^2)
// Time complexity= O(N^3 + N!)= O(N!)
