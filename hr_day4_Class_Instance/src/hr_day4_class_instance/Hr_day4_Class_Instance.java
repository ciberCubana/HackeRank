/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_day4_class_instance;

import java.io.*;
import java.util.*;

/**
 *
 * @author npgamboa
 */
public class Hr_day4_Class_Instance {

    /**
     * @param args the command line arguments
     */
    

        private int age;

      public Hr_day4_Class_Instance(int initialAge) {
          if(initialAge>=0) {
              setAge(initialAge); 
          }else{
              setAge(0);
          System.out.println("Age is not valid, setting age to 0");
// Add some more code to run some checks on initialAge
          }
      }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
      
      

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if(getAge()<13){
                System.out.println("You are young");
            } else{
                        if(getAge()>=13 && getAge()<18){
                            System.out.println("You are a teenager");
                        }else
                            System.out.println("You are old");
                        
            }
            
        }

        public void yearPasses() {
          int incAge = getAge() + 1;
            setAge(incAge);// Increment this person's age.
        }

        // TODO code application logic here
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Hr_day4_Class_Instance p = new Hr_day4_Class_Instance(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }

    }


