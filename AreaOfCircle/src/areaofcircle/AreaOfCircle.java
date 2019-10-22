
package areaofcircle;

import java.util.Scanner;

/**
 *
 * @author jdeshpande
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the radius of Circle: " );
        double radius = scanner.nextDouble();
       // System.out.println("Enter the width of Rectangle: ");
       // double width = scanner.nextDouble();
        
        double area = 3.14*radius*radius;
        System.out.println("Area of Circle is: " +area);
        
    }
    
}
