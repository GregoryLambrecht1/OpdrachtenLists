package opdrachtLists;

import java.util.LinkedList;

public class Q10 {
    public static void main(String[] args) {
        LinkedList<Q10Class> colours1 = new LinkedList<>();
        colours1.add(new Q10Class("red"));
        colours1.add(new Q10Class("green"));
        colours1.add(new Q10Class("black"));
        colours1.add(new Q10Class("white"));
        colours1.add(new Q10Class(null));

        LinkedList<Q10Class> colours2 = new LinkedList<>();
        colours2.add(new Q10Class("red"));
        colours2.add(new Q10Class("green"));
        colours2.add(new Q10Class("black"));
        colours2.add(new Q10Class(null));

    //using .equals() to check if both of the objects are the same , generated hash code + equals
    //method to make sure the objects would be recognised as each other if they had the same name
        System.out.println("the list is equal? : " + colours1.equals(colours2));

    }
}
