/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge2arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author npgamboa
 */
public class Merge2Arrays {
    

/*
 * Complete the function below.
 */

    static int[] mergeArrays(int[] a, int[] b) {
        int [] result = new int [2 * a.length];
        
        for (int i = 0; i < a.length; i++) {
             result[i] = a[i];
 }
        for (int i = 0; i < b.length; i++) {
             result[i+b.length] = b[i];
 }
        
        int size = result.length-1;
    int minPos;
        for(int j = 0; j <= size; j++){
            minPos = j;
                for(int i = j+1; i <= size; i++){
                     if(result[i] < result[minPos]){
                         minPos = i;
                     }   
                }
                if(minPos!=j){
                    int tmp = result[j];
                    result[j]=result[minPos];
                    result[minPos]= tmp;
                }
        }
        // System.out.println(""+ result);
return result;
    }

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine());
            _a[_a_i] = _a_item;
        }
        
        
        int _b_size = 0;
        _b_size = Integer.parseInt(in.nextLine());
        int[] _b = new int[_b_size];
        int _b_item;
        for(int _b_i = 0; _b_i < _b_size; _b_i++) {
            _b_item = Integer.parseInt(in.nextLine());
            _b[_b_i] = _b_item;
        }
        
        res = mergeArrays(_a, _b);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }

    
}
