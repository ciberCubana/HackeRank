/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day21.generics;

import java.util.*;

/**
 *
 * @author npgamboa
 */
class Printer<T> {

    <T> void printArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

    }

}

public class Generics {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
