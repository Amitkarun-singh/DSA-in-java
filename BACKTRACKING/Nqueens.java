package BACKTRACKING;

import java.util.*;

public class Nqueens {
    // Time complexity:-O(n!)
    public static boolean isSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void NQueens(char board[][], int row) {
        if (row == board.length) {
            count++;
            printBoard(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                NQueens(board, row + 1);
                board[row][i] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("---------chess board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of chess board:-");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        NQueens(board, 0);
        System.out.println("Total ways to solve n queens = " + count);
    }

}
