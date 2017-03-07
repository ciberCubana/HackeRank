/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day14_scope;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {

    private int[] elements;
    public int maximumDifference;

   public Difference(int[] elements) {
        this.elements = elements;

    }

    public int computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (Math.abs(elements[j] - elements[i]) > maximumDifference) {
                    maximumDifference = Math.abs(elements[j] - elements[i]);
                }

            }

        }
        return maximumDifference;

    }
  
} // End of Difference class

public class Hr_day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
/**
 *
 * @author npgamboa
 */
