/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day9_recursion;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author npgamboa
 */
public class Hr_day9_recursion {

    /**
     * @param args the command line arguments
     */
    private static int factorial(int n){
        
        
        if(n > 1) { 
        return n * factorial(n - 1);
    }
    // Base Case n <= 1
    else { 
        return n;
    }
        
    }
    
    
    public static void main(String[] args) {
            // TODO code application logic here
            Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
        }
    
}
