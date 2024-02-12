/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

/* So once upon a time, I googled how to break a string down into individual characters.
I learned of a couple methods that could be used, but the most simple thing wss checking the
length of the strenth and comparing to the current index. So basically what we have here is...
 */

import java.util.Scanner; //import scanner
public class Main {
    public static void main(String[] args) {

        Scanner og = new Scanner(System.in); //make new scanner
        System.out.print("Enter a string: "); //print out an input prompt
        String word = og.nextLine(); //create a variable to store the input as a string

        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i) + " ");{
/*for loop that starts the with i being set 0 since we want to start at the first letter,
we then check the length of the input word with .length which returns the amount of characters in
a word starting at 0, and while i is less than the length of the word we print each index
by incrementing i + 1, eventually giving us the whole word either spaced out on one line with print
or one character per line as seen with println or sum like dat
 */
            }
        }
    }
}






