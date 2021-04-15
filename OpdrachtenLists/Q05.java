package opdrachtLists;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
    //adding strings to the list
        colours.add("red");
        colours.add("green");
        colours.add("black");
        colours.add("white");
        colours.add("pink");

    //printing first list
        System.out.println("------first list------");
        colours.forEach(colour -> System.out.println(colour));

        ArrayList<String> colours2 = new ArrayList<>();

    //adding strings to second list
        colours2.add("red");
        colours2.add("green");
        colours2.add("black");
        colours2.add("pink");

    //printing second list
        System.out.println("------second list------");
        colours2.forEach(colour -> System.out.println(colour));

    //using retainall to check if elements are the same in both lists
        colours.retainAll(colours2);


    //printing the elements that were in both lists
        System.out.println("------strings that were in both lists------");
        colours.forEach(colour -> System.out.println(colour));
    }
}
