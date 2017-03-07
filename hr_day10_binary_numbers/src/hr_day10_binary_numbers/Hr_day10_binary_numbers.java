/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day10_binary_numbers;
 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author npgamboa
 */
public class Hr_day10_binary_numbers {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner scr = new Scanner(System.in) ; 
    int n = scr.nextInt() ; 
    int c = 0 ;
    int max = 0 ;
    
    while(n>0)
    {
        if(n%2==1)
        {
            c++ ;
            if(c>max)
    {
        max = c ;
            }
    }
        else
        {
            c = 0 ;
        }
        n=n/2 ;
    }
    System.out.println(max) ;
    }}

 