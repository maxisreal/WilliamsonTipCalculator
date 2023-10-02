import java.util.Objects;
import java.util.Scanner;

import java.text.DecimalFormat;
//https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
public class fyouimgay{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("How many people in your group?: ");
        int number = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100%): ");
        double tip = scan.nextDouble();
        double cost = 0;
        while (tip > 100){
            System.out.print("Enter the tip percentage (0-100%): ");
            tip = scan.nextDouble();
        }
        double totalCost = 0;


        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents (type -1 to end): ");
            cost = scan.nextDouble();
            totalCost += cost;
        }
        totalCost++; //gets rid of -1
        String currency = null;
        double convert = 2;
        while (convert == 2) {
            System.out.println("Enter currency type (₩, $, €, ¥): ");
            currency = scan.nextLine();
            switch (currency) {
                case "yen" -> {
                    currency = "¥";
                    convert = 149.69;
                }
                case "won" -> {
                    currency = "₩";
                    convert = 1351;
                }
                case "dollar", "usd" -> {
                    currency = "$";
                    convert = 1;
                }
                case "euro" -> {
                    currency = "€";
                    convert = 0.95;
                }
                default -> currency = "?";
            }
        }
            totalCost *= convert;
        System.out.println("___________________________________");
        System.out.println("Total before tip: " + currency + df.format(totalCost*convert));
        System.out.println("Tip percentage: " + (int)(tip) + "%");
        tip *=0.01;
        System.out.println("Tip: "+ currency + df.format(totalCost*tip));
        tip++;

        System.out.println("Total after tip: " + currency + df.format(totalCost*tip));
        System.out.println("Total per person before tip: " + currency + df.format(totalCost/number));
        tip--;
        System.out.println("Tip per person: "+currency + df.format(totalCost*tip/number));
        tip++;
        System.out.println("Total per person: "+currency + df.format(totalCost*tip/number));
        System.out.print("Done!");
    }
}
