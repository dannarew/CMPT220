//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class filepractice {
    public static void main(String[] args){
        //HI :)
        int gpaNames = 0;
        //do you need something to start?
        
        File inputfile = new File("practice.txt");
        try {
            Scanner og = new Scanner(inputfile);
            while(og.hasNext()){
                String name = og.nextLine();
                double gpa = Double.parseDouble(og.nextLine());
                if (gpa > 3.5) {
                    System.out.println("Above a 3.5 GPA: " + name);
                //what do we do at every line of the file?
            }
            gpaNames++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
      //optional if you want to keep this, just to show what the indices are of the list you created
        System.out.println("Total names: " + gpaNames);
    }
}

