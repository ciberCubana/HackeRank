/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day11_2d_arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author npgamboa
 */
public class Hr_day11_2d_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sumaMax = Integer.MIN_VALUE, sumaTemp = 0;
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();

            }
        }
         
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumaTemp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]+
                 arr[i + 1][j + 1]
               + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                
                if (sumaTemp > sumaMax) {
                sumaMax = sumaTemp;
                    System.out.println(""+ sumaTemp +"MAXIMA" + sumaMax   );
            }

            } sumaTemp=0;

           

        } 
        
        System.out.println(""+ sumaMax);
    }
}
