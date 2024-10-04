import java.util.Scanner;

public class selection2exp1_244107060062 {

    public static void main(String[] args) {
        Scanner input244107060062 = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = input244107060062.nextInt();

        if(year%4 == 0)
            if(year%100 == 0)
                if(year%400 == 0)
                    System.out.println("Leap year");
                else
                    System.out.println("Not a leap year");
            else
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
