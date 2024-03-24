
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};
        //you cannot use the array util. Do this one by hand :(
        int[] found = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {

            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i] == myArray[j]) {

                    if (found[i] == 0) {
                        System.out.println("Number " + myArray[i] + " is a duplicate.");
                    }
                    found[i]++;
                    found[j]++;
                }
            }
        }

        boolean duplicate = false;
        for (int i = 0; i < myArray.length; i++) {
            if (found[i] > 0) {

                duplicate = true;
                System.out.println(myArray[i] + " has" + " been seen " + (found[i] + 1) + " times ");
                //seems to overprint/spam the occurences, but if it ain't broke don't fix it :)
            }
        }
        if (!duplicate) {
            System.out.println("No duplicates found");
        }
    }
}