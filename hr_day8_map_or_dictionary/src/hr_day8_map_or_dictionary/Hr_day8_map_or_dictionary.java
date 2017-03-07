/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day8_map_or_dictionary;

import java.util.*;
import java.io.*;

/**
 *
 * @author npgamboa
 */
public class Hr_day8_map_or_dictionary {

    /**
     * @param args the command line arguments
     */
    //Complete this code or write your own from scratch
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, String> myMap = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            // Create a Map of String Keys to String Values, implemented by the HashMap class

// Adds ("Hi","Bye") mapping to myMap
            myMap.put(name, "" + phone);

// Print the Value mapped to from "Hi"
//System.out.println(myMap.get("Hi")); 
// Replaces "Bye" mapping from "Hi" with "Bye!" 
//myMap.put("Hi", "Bye!"); 
// Print the Value mapped to from "Hi"
//System.out.println(myMap.get(name));
        }

        while (in.hasNext()) {
            String s = in.next();
//             Write code here
            if (myMap.containsKey(s)) {

                System.out.println(s + "=" + myMap.get(s));
            } else {
                System.out.println("Not found");

            }

        }
        in.close();
    }
}
