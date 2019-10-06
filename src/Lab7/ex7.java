package Lab7;

import java.util.Scanner;

public class ex7 {
    public static void main (String [ ] args){

        Scanner SC = new Scanner(System.in) ;

        int X = 1;

         do {
            System.out.print("Enter an integer: ");
            X = SC.nextInt();
        } while (X ! = 0);

        System.out.println("Good Bye.");
    }
}
