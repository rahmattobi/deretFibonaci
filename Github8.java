/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Github8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fibonanci = new Scanner(System.in);
  
        int n = fibonanci.nextInt();
        int fib[] = new int[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 1; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
    }
    

