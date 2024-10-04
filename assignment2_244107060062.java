import java.util.Scanner;

public class assignment2_244107060062 {
    public static void main(String[] args) {

        Scanner input244107060062 = new Scanner(System.in);

        String category;
        int numberOfBook;

        System.out.print("Input the book category (Dictionary, Novel, Other): ");
        category = input244107060062.nextLine();

        System.out.print("Input the number of book bought: ");
        numberOfBook = input244107060062.nextInt();

        double discount = 0;
        if(category.equalsIgnoreCase("dictionary"))
                if(numberOfBook >= 3)
                    discount = 0.12;
                else
                discount = 0.10;
            else if(category.equalsIgnoreCase("novel"))
                discount = 0.7;
                    if(numberOfBook > 3)
                        discount =+ 0.1;
            else if(category.equalsIgnoreCase("other") && numberOfBook > 3)
                discount = 0.5;

        System.out.println("The discount is " + discount * 100 + "%");
        ;
    }
}

