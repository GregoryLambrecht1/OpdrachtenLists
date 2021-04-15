package opdrachtLists;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q12 {
    public static void main(String[] args) {
        // making new hash set and adding strings
        HashSet<String> colours = new HashSet<>();
        colours.add("red");
        colours.add("white");
        colours.add("pink");
        colours.add("yellow");
        colours.add("black");
        colours.add("green");

        System.out.println("hash set list : " + colours);
        //making new tree set with the hash set list strings
        Set<String> coloursTree = new TreeSet<>(colours);

        //printing tree set list
        if (!coloursTree.isEmpty()) {
            System.out.println("tree set list : " + coloursTree);
        }
    }
}