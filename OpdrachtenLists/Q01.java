package opdrachtLists;

import java.util.ArrayList;


public class Q01 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
    //adding elements to list
         colours.add("red");
         colours.add("green");
         colours.add("orange");
         colours.add("white");
         colours.add("black");

    //printing out the list
         colours.forEach(colour -> System.out.println(colour));
    }
}
