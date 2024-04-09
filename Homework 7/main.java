// I gave a working example of a student!
import java.util.Random;

public class Main {
    public static void main(String[] args){
        student stu1 = new student("Melissa","Senior", 3.4, 1132);
        student stu2 = new student("Dan","Freshman", 3.7, 1156);
        student stu3 = new student("Joe","Sophomore", 3.9, 1147);
        student stu4 = new student("Katherine","Senior", 4.0, 1101);
        student stu5 = new student("John", "Junior", 3.5, 1199);

        System.out.println(stu1.getName() + " is on the honor roll: " + stu1.honorStatus());
        System.out.println(stu2.getName() + " is on the honor roll: " + stu2.honorStatus());
        System.out.println(stu3.getName() + " is on the honor roll: " + stu3.honorStatus());
        System.out.println(stu4.getName() + " is on the honor roll: " + stu4.honorStatus());
        System.out.println(stu5.getName() + " is on the honor roll: " + stu5.honorStatus());

        //extra crunchy

        Random random = new Random();
        int upperbound = 1200;
        int lowerbound = 1100;
        int randID = random.nextInt(upperbound-lowerbound) + lowerbound;

        System.out.println("Today's random ID for free lunch: " + randID);


        if (stu1.receivesFreeLunch(randID)) {
            System.out.println(stu1.getName() + " receives free lunch today!");
        }
        else if (stu2.receivesFreeLunch(randID)) {
            System.out.println(stu2.getName() + " receives free lunch today!");
        }
        else if (stu3.receivesFreeLunch(randID)) {
            System.out.println(stu3.getName() + " receives free lunch today!");
        }
        else if (stu4.receivesFreeLunch(randID)) {
            System.out.println(stu4.getName() + " receives free lunch today!");
        }
        else if (stu5.receivesFreeLunch(randID)) {
            System.out.println(stu5.getName() + " receives free lunch today!");
        } else {
            System.out.println("No student receives free lunch today.");
        }
    }
}






