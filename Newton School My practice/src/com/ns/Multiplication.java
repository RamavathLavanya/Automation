package com.ns;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		  
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of "+n+" :");
        
        printTable(n);
    }
    
    private static void printTable(int n) 
    {
        
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}