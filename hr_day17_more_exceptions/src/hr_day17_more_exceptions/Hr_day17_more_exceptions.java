/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day17_more_exceptions;

import java.util.*;
import java.io.*;

/**
 *
 * @author npgamboa
 */
class Calculator {

    int result = 0;

    public int power(int n, int p) throws Exception {

        if (n > 0 && p > 0) 
            result = (int) Math.pow(n, p);
            else       
            throw new Exception("n and p should be non-negative");
                return result;
        
    }
}

public class Hr_day17_more_exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
