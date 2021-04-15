package opdrachtLists;

import java.util.PriorityQueue;

public class Q16 {
    public static void main(String[] args) {
        PriorityQueue<String> colours = new PriorityQueue<>();
        colours.add("black");
        colours.add("red");
        colours.add("green");
        colours.add("white");

    //printing the queue
        System.out.println("Original Priority Queue: " + colours);

    //converting into string
        String coloursString = colours.toString();

    //printing out the string
        System.out.println("String repr. of the queue : " + coloursString);
    }
}
