 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner og = new Scanner(System.in);

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
    // did scanners since it just seems to make use of the cases better
        System.out.println("Enter a number: ");
        int var1 = og.nextInt();
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else if (var1 < 4) {
            System.out.println("Var1 is less than 4");
        }else{
            System.out.println("Var1 is equal to 4");
        }
        System.out.println("Enter a number: ");
        int var2 = og.nextInt();
        } if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else if (var2 < 5){
            System.out.println("Var2 is less than 5");
        } else{
            System.out.println("Var2 is equal to 5");
        }
        System.out.println("Enter a number: ");
        int var3 = og.nextInt();
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else if {
            System.out.println("Var3 is less than 10");
        } else{
        System.out.println("Var3 is equal to 10");
        }


        //Scanner yo = new Scanner(System.in);

        System.out.println("Enter the name of a college: ");
        String college = og.nextLine();
// logic gates weren't working, but this method thing did? ¿Por qué?
        if (college == "marist" || college == "Marist" || college == "marist" || college == "MARIST"){
        //if (college.equalsIgnoreCase("marist")) {
            System.out.println("Marist college!");
        } else {
            System.out.println("Not Marist college :(!");
        }



    }
}
