package opdrachtLists;

import java.util.ArrayList;


public class Q03 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();

    //adding strings to the list
        colours.add("red");
        colours.add("green");
        colours.add("orange");
        colours.add("white");

    //printing the list
        colours.forEach(colour -> System.out.println(colour));

        System.out.println("----------------");

    //adding "pink" to postion : 0
        colours.add(0,"pink");

    //printing the list
        colours.forEach(colour -> System.out.println(colour));

        }

}

