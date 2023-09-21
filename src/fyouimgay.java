
import java.util.Scanner;
public class fyouimgay{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people in your group?: ");
        int number = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100%): ");
        int tip = scan.nextInt();
        double cost = 0;
        double totalCost = 0;

        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents (type -1 to end): ");
            cost = scan.nextDouble();
            totalCost += cost;
        }
        totalCost++;
        // code below the while loop runs after the loop ends
        System.out.println("Total before tip: $" + totalCost);
        System.out.println("Tip percentage: " + tip + "%");
        System.out.print("Done!");

    }
}
