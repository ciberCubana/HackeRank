/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day5_loops;

/**
 *
 * @author npgamboa
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;





public class Hr_day5_Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<11;i++){
            System.out.println(""+n+" x "+i+" = "+n*i);
        
        }
    }
    
}
