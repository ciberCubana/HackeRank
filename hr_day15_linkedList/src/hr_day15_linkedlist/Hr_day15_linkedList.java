/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day15_linkedlist;

import java.io.*;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

/**
 *
 * @author npgamboa
 */
public class Hr_day15_linkedList {

    public static Node insert(Node head, int data) {
        //Complete this method
        if(head == null)
    {
        head = new Node(data);
    }
    else
    {
        Node actual = head;
        while(actual.next != null)
            actual = actual.next;
        actual.next = new Node(data);
    }
    return head;
}

    /**
     * @param args the command line arguments
     */
    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
