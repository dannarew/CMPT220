import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner og = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        //we make it <= 10 so that it stops at 10 rather than 9
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");

        int input2 = og.nextInt();

        long factorial = 1;

        for (int i = 1; i <= input2; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + input2 + " is: " + factorial);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from index 0)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");

        int input3 = og.nextInt();

        int sum = 0;
        int index = 0;

        while (input3 > 0) {
            int digit = input3 % 10;

            if (index % 2 == 0) {
                sum += digit;
            }

            input3 /= 10;
            index++;
        }
        System.out.println("Sum of every other digit: " + sum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");

        boolean run = true;

        while (run == true) {
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");

        System.out.println("Enter a string: ");

        String input5 = og.next();

        String reverse = "";
        for (int i = input5.length() - 1; i >= 0; i--) {
            reverse += input5.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
    }
}

