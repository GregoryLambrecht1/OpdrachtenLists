package opdrachtLists;

import java.util.LinkedList;

public class Q11 {
    public static void main(String[] args) {
        LinkedList<Q11Class> colours = new LinkedList<>();
    //adding new objects to list
        colours.add(new Q11Class("red"));
        colours.add(new Q11Class("green"));
        colours.add(new Q11Class("black"));
        colours.add(new Q11Class("white"));


    //printing list
        System.out.println(colours);

    //setting position 1 --> new class with "orange" name
        colours.set(1,new Q11Class("orange"));

    //printing list after the change
        System.out.println(colours);

    }
}
