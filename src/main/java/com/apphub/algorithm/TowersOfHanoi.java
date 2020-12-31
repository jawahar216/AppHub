package com.apphub.algorithm;

import java.util.Scanner;

public class TowersOfHanoi {

    public static void main(String[] args) {
        System.out.println("Enter the number of disks : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solveTowersOfHanoi(n, 'A', 'C', 'B');
    }

    static void solveTowersOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        //If there is only one disk, move from source to destination and return
        if (n == 1) {
            System.out.println("Moving disk 1 from " + fromPeg + " to " + toPeg);
            return;
        }
        //Move the top n-1 disks from A to B using C as auxiliary
        solveTowersOfHanoi(n - 1, fromPeg, auxPeg, toPeg);
        //Move remaining disks from A to C
        System.out.println("Moving disk " + n + " from " + fromPeg + " to " + toPeg);
        //Move n-1 disks from B to C using A as auxiliary
        solveTowersOfHanoi(n - 1, auxPeg, toPeg, fromPeg);
    }
}