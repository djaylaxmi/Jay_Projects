/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofrectangle;

import java.util.Scanner;

/**
 *
 * @author jdeshpande
 */
public class AreaOfRectangle {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the length of Rectangle: " );
        double length = scanner.nextDouble();
        System.out.println("Enter the width of Rectangle: ");
        double width = scanner.nextDouble();
        
        double area = length*width;
        System.out.println("Area of Rectangle is: " +area);
        
    }
    
}
