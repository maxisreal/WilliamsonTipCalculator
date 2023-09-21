
import java.util.Scanner;
public class fyouimgay {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many people in your group?: ");
    int number = scan.nextInt();
    int cost = 0;
    int stringCompare = -1;

    // the while loop condition is checked,
    // and if TRUE, runs the code inside.
    // when the code inside is done running, the condition is rechecked,
    // and the loop repeats as long as the condition remains TRUE.
    // when the condition becomes FALSE, it stops
    while (cost == stringCompare) {
        System.out.print("No silly, i said EVEN not odd! Try again: ");
        number = scan.nextInt();
    }

    // code below the while loop runs after the loop ends
    System.out.print("Done!");

}
