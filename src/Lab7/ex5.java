package Lab7;

import java.util.Scanner;

public class ex5 {
    public static void main (String [ ] args){
        Scanner SC = new Scanner(System.in);

        int total = 0;
        int X = 0;

        for (int i = 0; i < 5; i++) {


            System.out.print("Enter an integer : ");
             X = SC.nextInt();
             if (X%2 ==0 )
            totalEven +=  X;  //total = total+X;
            else
                totalodd + = X;

            System.out.println("Total of even number:" + total);

        }
    }
}
