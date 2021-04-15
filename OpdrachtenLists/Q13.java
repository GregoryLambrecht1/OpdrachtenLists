package opdrachtLists;

import java.util.HashSet;
import java.util.Set;

public class Q13 {
    public static void main(String[] args) {
    //making new hash set
        HashSet<Q13Class> colours = new HashSet<>();
        colours.add(new Q13Class("red",true));
        colours.add(new Q13Class("white",false));
        colours.add(new Q13Class("black",true));
        colours.add(new Q13Class("green",false));

    //making second hash set
        Set<Q13Class>colours2 = new HashSet<>();
        colours2.add(new Q13Class("red", true));
        colours2.add(new Q13Class("pink", false));
        colours2.add(new Q13Class("black", true));
        colours2.add(new Q13Class("orange", false));

    //using retain all to check if there are the same objects
        colours.retainAll(colours2);

    //printing the list with the same objects
        System.out.println(colours);

    }
}
