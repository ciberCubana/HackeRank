/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day20_sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void sort(int lenght, int[] a) {
        int n = a.length;
        int tmp, i;
        int numberOfSwaps = 0;
        for (i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 0;
        int tmp = 0;
        int numberOfSwaps = 0;
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();

        }
        sort(n, a);
    }
}
