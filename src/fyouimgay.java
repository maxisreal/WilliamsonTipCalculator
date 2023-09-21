import java.util.Scanner;

public class fyouimgay{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people in your group?: ");
        int number = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100%): ");
        double tip = scan.nextDouble();
        double cost = 0;
        double totalCost = 0;

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents (type -1 to end): ");
            cost = scan.nextDouble();
            totalCost += cost;
        }
        totalCost++; //gets rid of -1
        //pushtest
        System.out.println("___________________________________");
        System.out.println("Total before tip: $" + totalCost);
        System.out.println("Tip percentage: " + (int)(tip) + "%");
        tip *=0.01;
        System.out.println("Tip: $" + totalCost*tip);
        tip++;

        System.out.println("Total after tip: $" + totalCost*tip);
        System.out.println("Total per person before tip: $" + totalCost/number);
        tip--;
        System.out.println("Tip per person: $" + totalCost*tip/number);
        tip++;
        System.out.println("Total per person: $" + totalCost*tip/number);
        System.out.print("Done!");
    }
}
