/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day7_arrays;

import java.io.*;
import java.util.*;

/**
 *
 * @author npgamboa
 */
public class Hr_day7_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        for (int i = 0; i < n; i++) 
                
            
            System.out.print(arr[n - 1 - i] + " ");

        

        in.close();
    }
}
