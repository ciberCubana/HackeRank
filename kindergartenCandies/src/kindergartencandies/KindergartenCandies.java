/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kindergartencandies;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


    
/**
 *
 * @author npgamboa
 */
public class KindergartenCandies {
    
     static int distributeCandy(int[] score) {

    int len = score.length;
    int result=0;

    if (len==1) {
        return 1;
    }

    for (int i=0; i<len; i++) {
        result++;
        if (i==0) {
            if (score[i] > score[i+1]) {
                result++;
            }
        }
        else if (i==len-1) {
            if (score[i] > score[i-1]) {
                result++;
            }
        }
        else {

            if (score[i] > score[i+1]) {
                result++;
            }

            if (score[i] > score[i-1]) {
                result++;
            }
        }
    }

    return result;
 }

    



    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
        // TODO code application logic here
        
        
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
             int res;
             
             int _score_size = Integer.parseInt(in.nextLine());
             int[] _score = new int[_score_size];
             int _score_item;
             for(int _score_i = 0; _score_i < _score_size; _score_i++) {
                 _score_item = Integer.parseInt(in.nextLine());
                 _score[_score_i] = _score_item;
             }
             
             res = distributeCandy(_score);
             bw.write(String.valueOf(res));
             bw.newLine();
         }
    }
}
    

