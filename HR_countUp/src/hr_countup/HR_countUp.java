/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_countup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author npgamboa
 */
public class HR_countUp {

    /**
     * @param args the command line arguments
     */
    static void countUp(int start) {
        for (int i = start+1; i < start+11; i++) {
            if(i == start+10)
                System.out.print(""+i);
            else
                System.out.print(i+ " then ");
        }

            
        
    }
    
 
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int _start;
        _start = Integer.parseInt(in.nextLine());

        countUp(_start);

    }
}
