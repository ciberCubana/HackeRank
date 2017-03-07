/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day13_abstractclass;

import java.util.*;

/**
 *
 * @author npgamboa
 */


    abstract class Book {

        String title;
        String author;

        Book(String t, String a) {
            title = t;
            author = a;
        }

        abstract void display();

    }

  
  //Write MyBook Class
  class MyBook extends Book {
            int price;
        MyBook(String title, String author, int p) {
            super(title, author);
            price = p;

        }
        
        void display(){
            System.out.println("Title: "+ title);
            System.out.println("Author: "+ author);
            System.out.println("Price: "+ price);
            
        
        }
    }
public class Hr_day13_abstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();

    }
}
