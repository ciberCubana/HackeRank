/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            if (x < 10) {
                System.out.println(s1.format("%-15s 00%s", s1, x));
            } else {
                if (x >= 10 && x < 100) {
                    System.out.println(s1.format("%-15s 0%s", s1, x));

                } else {
                    System.out.println(s1.format("%-15s %s", s1, x));

                }

            }
            System.out.println("================================");

        }
    }
}
