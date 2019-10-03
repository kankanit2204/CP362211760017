package Lab7;

import java.util.Scanner;

public class ex2 {
    Scanner sc = new Scanner(System.in);

    System.out.print ("Enter your score," +
            "and I will tell you grade:");

    int score = sc.nextInt();

    if (score < 50)
        System.out.println ("Grade F. ");
    else if (score < 60 )
            System.out.println ("Grade D. ");
    else if (score < 65 )
            System.out.println ("Grade D+. ");
    else if (score < 70 )
            System.out.println ("Grade c. ");
    else if (score < 75 )
            System.out.println ("Grade c+. ");
    else if (score < 80 )
            System.out.println ("Grade B. ");
    else
            System.out.println ("Grade A. ");

}
