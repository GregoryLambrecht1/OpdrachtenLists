package opdrachtLists;

import java.util.LinkedList;


public class Q08 {
    enum enumColours {
        RED,GREEN,BLACK,PINK,ORANGE
    }
    public static void main(String[] args) {

        LinkedList<enumColours> colours = new LinkedList<>();

        colours.add(enumColours.RED);
        colours.add(enumColours.GREEN);
        colours.add(enumColours.BLACK);
        colours.add(enumColours.PINK);
        colours.add(enumColours.ORANGE);

        System.out.println("original list : ");
        colours.forEach(colour -> System.out.println(colour));

    //using .getfirst() and .getlast() to get both first and last elements
        System.out.println("first element : " + colours.getFirst());
        System.out.println("last element : " + colours.getLast());
    }
}
