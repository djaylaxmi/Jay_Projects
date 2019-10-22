/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkevenodd;

import java.util.Scanner;

/**
 *
 * @author jdeshpande
 */
public class CheckEvenOdd {

    
    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Ener an Integer Number: ");
        
        //The input Provided by user is stored in num
        
        Scanner input = new Scanner (System.in);
        num = input.nextInt();
        
        // If number is divisible by two then it is an even number
        
        if(num %2 == 0)
            System.out.println("Entered Number is Even)");
        else
            System.out.println("Entered Number is Odd");
                
        
    }
    
}
