// opgave 4 fra import og brug af klasser  
package scanneropgave;

import java.util.Scanner;

/**
 *
 * @author Kim Vammen
 */
public class main
{
    public static void main(String[] args) 
    {
        String message; 
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a line of text: ");
        
        message = scan.nextLine();
        
        System.out.println("You entered: " + message);
    }
}
