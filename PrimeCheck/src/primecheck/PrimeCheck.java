/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primecheck;

import java.util.Scanner;

/**
 *
 * @author jdeshpande
 */
public class PrimeCheck {

    
    public static void main(String[] args) {
     int temp;
     boolean isPrime=true;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a Number for Check : ");
     //Capture the input in an integer
     
     int num = scan.nextInt();
     
     for(int i=2; i<=num/2; i++)
     {
         temp= num%i;
         
         if(temp ==0)
         {
             isPrime=false;
             break;
         }
     }
       //if isPrime is true then number is prime elase not
     
     if(isPrime)
         System.out.println(num + " is Prime Number");
     else
         
         System.out.println(num +  "is not Prime Number");
         
             
    }
    
}
