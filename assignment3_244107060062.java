import java.util.Scanner;

public class assignment3_244107060062 {
    public static void main(String[] args) {
        Scanner input244107060062 = new Scanner(System.in);

        String brand;
        System.out.print("Input the brand name (Converse, Sketcher, Nike): ");
        brand = input244107060062.nextLine();

        String type;
        int size, price;
        if (brand.equalsIgnoreCase("Converse")) {
            System.out.print("Input the type name (Slip on / High Top): ");
            type = input244107060062.nextLine();
            if (type.equalsIgnoreCase("slip on")) {
                System.out.print("Input the size (36 - 40): ");
                    size = input244107060062.nextInt();
                    price = 800000;
                    System.out.println("The price is Rp." + price);
            }
            if (type.equalsIgnoreCase("high top")) {
                System.out.print("Input the size (40 - 44): ");
                    size = input244107060062.nextInt();
                    price = 120000;
                    System.out.println("The price is Rp." + price);
            }
        } else if(brand.equalsIgnoreCase("Sketcher")) {
            System.out.print("Input the type name (Woman / Man): ");
            type = input244107060062.nextLine();
            if (type.equalsIgnoreCase("woman")) {
                System.out.print("Input the size (36 - 41): ");
                    size = input244107060062.nextInt();
                    price = 1000000;
                    System.out.println("The price is Rp." + price);
            }
            if (type.equalsIgnoreCase("man")) {
                System.out.print("Input the size (41 - 44): ");
                    size = input244107060062.nextInt();
                    price = 180000;
                    System.out.println("The price is Rp." + price);
            }
        } else if(brand.equalsIgnoreCase("Nike")) {
            System.out.print("Input the type name (Kids / Adult): ");
            type = input244107060062.nextLine();
            if (type.equalsIgnoreCase("kids")) {
                System.out.print("Input the size (36 - 40): ");
                    size = input244107060062.nextInt();
                    price = 750000;
                    System.out.println("The price is Rp." + price);
            }
            if (type.equalsIgnoreCase("adult")) {
                System.out.print("Input the size (40 - 44): ");
                    size = input244107060062.nextInt();
                    price = 150000;
                    System.out.println("The price is Rp." + price);
            }
        }
    }
}
