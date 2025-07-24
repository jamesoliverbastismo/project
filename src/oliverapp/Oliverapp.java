package oliverapp;

import java.util.Scanner;

public class Oliverapp {

  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String name;
    int byear;
    
    System.out.print("Enter name: ");
    name = sc.nextLine();
    
    System.out.print("Enter Birth Year: ");
    byear = sc.nextInt();
    
    
    System.out.println("Hello "+name+"\nyour age is "+(2025-byear));
    
      }
    
            
    
    }
    

