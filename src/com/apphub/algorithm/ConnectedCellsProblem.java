package com.apphub.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConnectedCellsProblem {

    public static void main(String[] args) {
      /*int[][] matrix = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 1 }, { 0, 1, 1, 0, 0 }, { 1, 0, 0, 0, 1 },
            { 0, 1, 0, 1, 1 } };*/
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of matrix m X n");
        System.out.print("m : ");
        int m = scanner.nextInt();
        System.out.print("n : ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        Map<String, String> connectedMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    findMaxConnectedCells(i, j, count, matrix, connectedMap, m, n);
                }
            }
        }
        System.out.println("Max connections " + connectedMap.get("maxConnections"));
        System.out.println("Max connected cell  " + connectedMap.get("maxConnectedCell"));
    }

    static Map<String, String> findMaxConnectedCells(int i, int j, int count, int[][] matrix,
                                                     Map<String, String> connectedMap, int m, int n) {
        int previousCount =
                connectedMap.get("maxConnections") != null ? Integer.valueOf(connectedMap.get("maxConnections")) : 0;
        for (int k = i - 1; k <= i + 1 && k > -1 && k < m; k++) {
            for (int l = j - 1; l <= j + 1 && l > -1 && l < n; l++) {
                if (matrix[k][l] == 1) {
                    count++;
                }
            }
        }
        if (count > previousCount) {
            connectedMap.put("maxConnectedCell", "matix[" + i + "][" + j + "]");
            connectedMap.put("maxConnections", String.valueOf(count - 1));
        }
        return connectedMap;
    }
}