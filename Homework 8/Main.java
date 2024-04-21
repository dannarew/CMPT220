/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();

        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : stax) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        int numElements = stax.size();

        System.out.println("Number of elements: " + numElements);


        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        int count = 0;
        int middleValue = 0;

        for (int value : linky) {
            if (count == linky.size() / 2) {
                middleValue = value;
                break;
            }
            count++;
        }

        System.out.println("Middle value: " + middleValue);

        LinkedList<String> playlist = new LinkedList<>();


        playlist.add("Through Da Storm");
        playlist.add("Real Friends");
        playlist.add("Of Course");
        playlist.add("Grace");


        String currentSong = playlist.peek();
        System.out.println("Current song in playlist: " + currentSong);


        String songPlayed = playlist.poll();
        System.out.println("Now playing: " + songPlayed);

        currentSong = playlist.peek();
        System.out.println("Current song in playlist: " + currentSong);

        songPlayed = playlist.poll();
        System.out.println("Now playing: " + songPlayed);


        currentSong = playlist.peek();
        System.out.println("Current song in playlist: " + currentSong);

        songPlayed = playlist.poll();
        System.out.println("Now playing: " + songPlayed);

        currentSong = playlist.peek();
        System.out.println("Current song in playlist: " + currentSong);

        songPlayed = playlist.poll();
        System.out.println("Now playing: " + songPlayed);

        currentSong = playlist.peek();
        System.out.println("Current song in playlist: " + currentSong);

        songPlayed = playlist.poll();
        if (songPlayed == null) {
            System.out.println("No songs left in playlist.");
        }


    }
}



       