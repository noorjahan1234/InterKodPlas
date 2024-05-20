package com.PaycraftCompany;

import java.util.Scanner;

public class Main {

  private static final int[][] moves = {

    {-2, -1}, {-1, -2}, {1, -2}, {2, -1},

    {2, 1}, {1, 2}, {-1, 2}, {-2, 1}

  };
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[][] board = new int[8][8];

    for (int i = 0; i < 8; i++) {

      for (int j = 0; j < 8; j++) {
        board[i][j] = scanner.nextInt();
      }
    }

    System.out.println(analyzeKnightsSafety(board));
  }
  private static String analyzeKnightsSafety(int[][] board) {

    int captures = 0;

    for (int i = 0; i < 8; i++) {

      for (int j = 0; j < 8; j++) {

        if (board[i][j] == 1) {

          for (int[] move : moves) {

            int ni = i + move[0];

            int nj = j + move[1];

            if (ni >= 0 && ni < 8 && nj >= 0 && nj < 8 && board[ni][nj] == 1) {

              captures++;

            }

          }

        }

      }

    }

    if (captures > 0) {

      return "Possible captures: " + captures / 2; // Each capture is counted twice, so we divide by 2.

    } else {

      return "Knights are safely positioned.";

    }

  }

}

