/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Megha
 */
public class Student {

    int id;
    String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list=new Student[5];
        Scanner in=new Scanner(System.in);
        System.out.println(list.length);
            
        for(int i=0;i<list.length;i++)
        {
            list[i]=new Student();
            System.out.println("Enter student id: ");
            list[i].id=in.nextInt();
            System.out.println("Enter student name: ");
            list[i].name=in.next();
            
            System.out.println("student id: "+list[i].id+"  "+"student name: "+list[i].name);
            
        }
        
        
        
        
        
    }
    
}
