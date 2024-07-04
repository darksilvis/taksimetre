import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perkm = 40, total, startprice = 100, extraPrice = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many kilometers you will travel: ");
        km = input.nextInt();

        System.out.println("Is the passenger foreign or rich looking? (yes/no): ");
        String passengerStatus = input.next();

        if (passengerStatus.equalsIgnoreCase("yes")) {
            System.out.println("Enter the extra price for foreign or rich-looking passenger: ");
            extraPrice = input.nextDouble();
        }

        total = (km * perkm);
        total += startprice + extraPrice;

        total = (total < 100) ? 100 : total;
        System.out.println("Total price: " + total);
        System.out.println("This application was inspired by taxi drivers  :-)  ");
    }
}

