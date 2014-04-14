/* @author Alexis Malinowski
 * Displays the largest of two integers
 */
 
package w1A1;

import java.util.Scanner;

public class W1A1 {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int a;
       int b;
       
       System.out.print("Enter first integer: ");
       a = input.nextInt();
       
       System.out.print("Enter second integer: ");
       b = input.nextInt();
       
       if (a>b)
           System.out.print(a);
       else
           System.out.print(b);
    }
}
