package hr_day6_review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author npgamboa
 */
public class Hr_day6_Review {

    public static void printSplit(char[] myCharArray) {
        for (int i = 0; i < myCharArray.length; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < myCharArray.length; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {
            String word = sc.nextLine();

            printSplit(word.toCharArray());

        }

    }
}
