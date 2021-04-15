package opdrachtLists;
import java.util.TreeSet;

public class Q14 {
    public static void main(String[] args) {
        TreeSet<String> colours = new TreeSet<>();
    //adding colours to treeset
        colours.add("black");
        colours.add("green");
        colours.add("pink");
        colours.add("red");
        colours.add("orange");

        System.out.println("original tree set : " + colours);
    //making a new tree set
        TreeSet coloursClone = new TreeSet();

    //cloning the current tree set to the new tree set
        coloursClone = (TreeSet) colours.clone();

        System.out.println("cloned tree list : " + coloursClone);


    }
}
