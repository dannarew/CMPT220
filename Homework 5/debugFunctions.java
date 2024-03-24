/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

//not really asking for input, but plug in :)
    printFact(7);

    everyOther();

    reverse();

    
      
    }
//prob 1
    public static void printFact(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
    System.out.println("The factorial of " + num + " is " + factorial);
  }

//prob 2
    public static void everyOther(){
        Scanner og = new Scanner(System.in);
        System.out.println("Enter a number:");
        String input = og.nextLine();
        
        int sum = 0;
        for (int i = 0; i < input.length(); i += 2) {
            int digit = Character.getNumericValue(input.charAt(i));
            sum += digit;
        }
        
        System.out.println("Sum of every other digit: " + sum);
    }
    
    //prob 5
    public static void reverse() {
        Scanner yurp = new Scanner(System.in);
    System.out.println("Enter a string:");
    String input = yurp.nextLine();
        // string builder go brrrr, loops are scary
    StringBuilder flip = new StringBuilder(input).reverse();
    System.out.println("String reversed is: " + flip);
    }

  
     public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }
    
  
    public static void printDog(){
        System.out.println("Dog");
    }

  
}

