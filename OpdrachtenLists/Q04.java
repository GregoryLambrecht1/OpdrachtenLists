package opdrachtLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q04 {
    public static void main(String[] args) {
        ArrayList<String>colours = new ArrayList<>();

    //adding strings to the list
        colours.add("red");
        colours.add("green");
        colours.add("orange");
        colours.add("white");

    //printing the list
        colours.forEach(colour -> System.out.println(colour));

        System.out.println("---------------------");

    //shuffling the list
        Collections.shuffle(colours);

    //printing the list after the shuffle
        colours.forEach(colour -> System.out.println(colour));
    }
}
