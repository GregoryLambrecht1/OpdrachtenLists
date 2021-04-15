package opdrachtLists;

import java.util.ArrayList;
import java.util.Iterator;
public class Q02 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();

    //making the iterator list
        Iterator<String> colour = null;
        colours.add("red");
        colours.add("green");
        colours.add("orange");
        colours.add("white");

    //adding the list to the iterator list
        colour = colours.listIterator();

    //printing the list
       while (colour.hasNext()){
           System.out.println(colour.next());
       }
    }
}
