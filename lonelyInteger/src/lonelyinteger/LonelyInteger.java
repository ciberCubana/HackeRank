/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lonelyinteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author npgamboa
 */
public class LonelyInteger {
    
     static int lonelyInteger(int[] arr) {
          
         int size = arr.length-1;
         int i;
           for ( i = 0; i < size; i++) {
              if(arr[i]!=arr[i+1]){
                  
                  return arr[i];
              
              } i++;
              
             
         }return arr[i];

    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
