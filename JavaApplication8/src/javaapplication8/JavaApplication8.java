/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author npgamboa
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t;
            t = scan.nextInt();
            while (t > 0) {
                String str = scan.next();
                for (int i = 0; i < str.length(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(str.charAt(i));
                    }
                }
                System.out.print(" ");
                for (int i = 0; i < str.length(); i++) {
                    if (i % 2 == 1) {
                        System.out.print(str.charAt(i));
                    }
                }
                t = t - 1;
                System.out.println();
            }
        }
    }

