
//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
 * create a 3 question quiz game (lots of if/else likely)
 * requirements: keep track of the user's score, has to have at least 3 questions, use if/else
 * can be any topic you pick :) feel free to pick some obscure or niche topics!
 * good luck!
 * */

public class Main {
    public static void main(String[] args) {
        Scanner og = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to goofy color mixing game :)");
        System.out.println("Type START to begin: ");
        String start = og.nextLine();

        if (start.equalsIgnoreCase("START")) {

            System.out.println("Q1: What happens when you mix blue and yellow?");

            String answer1 = og.nextLine();

            if (answer1.equalsIgnoreCase("Green")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }

            System.out.println("Q2: What happens when you mix red and blue?");

            String answer2 = og.nextLine();

            if (answer2.equalsIgnoreCase("Purple")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }

            System.out.println("Q3: What happens when you mix red, blue, and yellow?");

            String answer3 = og.nextLine();

            if (answer3.equalsIgnoreCase("Brown")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }

            System.out.println("Your final score: " + score + "/3.");
        } else {
            System.out.println("If you're reading this I forgot to sanitize wrong inputs soooooooooo, run again :)");
        }
    }
}
