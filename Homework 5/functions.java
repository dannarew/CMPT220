/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

public class functions {
    //finds the min-max of an array
    public static void main(String[] args) {
        int[] test = {17, 40, 27, 2, 393, 191};
        upDown(test);
   
}
    public static void upDown(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Try again! ");
            return;
        }
        int min = arr[0];
        int max = arr[0];
    
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Lowest value is: " + min);
        System.out.println("Highest value is: " + max);
    }
}