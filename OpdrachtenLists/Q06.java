package opdrachtLists;

import java.util.ArrayList;

public class Q06 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();

    //adding strings to list
        colours.add("red");
        colours.add("green");
        colours.add("black");
        colours.add("white");
        colours.add("pink");

    //printing the list with index
        for (int index = 0 ; index < colours.size();index++){
            System.out.println(index + " : " + colours.get(index));
        }
    }
}
