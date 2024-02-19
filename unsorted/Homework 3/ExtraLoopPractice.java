//https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-6.php
import java.util.Scanner;
/*
The above link has the problem + solution for C, which is similar to java, so it should be a hint if you're struggling. but, complete that problem in Java with a while loop
(your print cannot look like the C solution, organize it differently)
*/


public class Main {
    public static void main(String[] args) {
    Scanner og = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int i = og.nextInt();

    int j = 1;
    while(j <= 10)
        {
            int product = i * j;
            System.out.println(i + " multiplied by " + j + " equals " + i * j);
            j++;
        }

    }
}
//code go brrrr