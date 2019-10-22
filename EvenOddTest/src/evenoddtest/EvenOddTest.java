/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoddtest;

import java.util.Scanner;

/**
 *
 * @author jdeshpande
 */
public class EvenOddTest {

   
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);
        
        System.out.printf("Enter any number: ");
        
        int number = console.nextInt();
        
        //If remainder is zero than even number
        
        if ((number %2)==0) {
            System.out.printf(" number %d is even number %n", number);  // %d -decimal , %n new line
            
            
        }else{
            // number is odd
            
            System.out.printf("Number %d is odd number %n", number);
            
            
            
            
        }
        //Finding Even and Odd number using Bitwise AND operator
        
        System.out.printf("Finding Number if it's even or odd using bitwise AND operator %n");
        
        if ((number &1)== 0){
            System.out.printf("Number %d is even number %n", number);
            
        }else{
            System.out.printf("number %d is odd number %n", number);
        }
    }
    
}
