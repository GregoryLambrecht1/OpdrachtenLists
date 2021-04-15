package opdrachtLists;

import java.util.LinkedList;


public class Q07 {
    public static void main(String[] args) {
        LinkedList<String> colours = new LinkedList<>();
        colours.add("red");
        colours.add("green");
        colours.add("black");
        colours.add("pink");
        colours.add(null);

        colours.forEach(colour -> System.out.println(colour));

        System.out.println("------------------------------");

    //using for loop backwards
        for (int index = colours.size()-1;index >= 0 ; index--){
            System.out.println(colours.get(index));
        }
    }
}
