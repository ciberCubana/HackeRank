/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stairscase;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 *
 * @author npgamboa
 */
public class StairsCase {
/*
 * Complete the function below.
 */
  static void StairCase(int n) {
  for(int j=0;j<n;j++){
            for(int i=1;i<=n;i++){
                System.out.print(i<n-j?" ":"#");
            }
            System.out.println("");
        }

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
             Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
        
    }
        // TODO code application logic here
    }
    

