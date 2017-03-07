/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockdecentnumber;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author npgamboa
 */
public class SherlockDecentNumber {

    static void decentNumber(String[] arr) {
        int size = arr.length - 1;

        String number = "";
        for (int i = 0; i < size; i++) {

            if (size < 3) {
                System.out.println("-1");
            } else {
                if (size == 3) {
                    System.out.println("555");
                } else {
                    if (size == 5) {
                        System.out.println("33333");
                    } else {
                        if (size > 5) {
                            int cant3 = size % 5 * 5;
                            int cant5 = size % 3 * 3;
                            int s = 0;
                            int z = 0;
                            while (s < cant3) {
                                System.out.print("3");
                                s++;

                            }
                            while (z < cant5) {
                                System.out.print("5");
                                z++;

                            }

                        }
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine());
        String[] _arr = new String[_arr_size];
        String _arr_item;
        for (int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            try {
                _arr_item = in.nextLine();
            } catch (Exception e) {
                _arr_item = null;
            }
            _arr[_arr_i] = _arr_item;
        }

        decentNumber(_arr);

    }

}
