/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coin_onthetable;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author npgamboa
 */
public class Coin_ontheTable {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        private static int k;

    private static char[][] table;

    private static int[][] costs;

    private static int sol() {
        move(0, 0, 0, 0);

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == '*') {
                    int minCost = costs[i][j];
                    return minCost == Integer.MAX_VALUE ? -1 : minCost;
                }
            }
        }

        return -1;
    }

    private static void move(int i, int j, int cost, int time) {

        if (!inBoard(i, j) || cost >= costs[i][j]) {
            return;
        }

        costs[i][j] = cost;

        if (table[i][j] == '*') {
            return;
        }
        if (time == k) {
            return;
        }

        move(i - 1, j, table[i][j] == 'U' ? cost : cost + 1, time + 1);

        move(i, j - 1, table[i][j] == 'L' ? cost : cost + 1, time + 1);

        move(i + 1, j, table[i][j] == 'D' ? cost : cost + 1, time + 1);

        move(i, j + 1, table[i][j] == 'R' ? cost : cost + 1, time + 1);
    }

    private static boolean inBoard(int i, int j) {
        return i >= 0 && i < table.length && j >= 0 && j < table[i].length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        k = scanner.nextInt();
        scanner.nextLine();
        table = new char[n][];

        for (int i = 0; i < n; i++) {
            table[i] = scanner.nextLine().toCharArray();
        }
        costs = new int[n][m];
        for (int i = 0; i < costs.length; i++) {
            Arrays.fill(costs[i], Integer.MAX_VALUE);
        }

        System.out.println(sol());
        
        scanner.close();
    }
}
        
        
    
    

