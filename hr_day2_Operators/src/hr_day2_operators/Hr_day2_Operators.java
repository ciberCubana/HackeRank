/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr_day2_operators;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author npgamboa
 */
public class Hr_day2_Operators {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost * ((double)tipPercent/100);
        double tax = mealCost * ((double)taxPercent/100);
        mealCost=mealCost+tip+tax;
                
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost);
      
        System.out.println("The total meal cost is " +totalCost+ " dollars.");   // Print your result
    }
}
    

