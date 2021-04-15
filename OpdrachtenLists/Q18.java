package opdrachtLists;

import java.util.HashMap;
import java.util.Map;


public class Q18 {
    public static void main(String[] args) {
        Map<Integer,String> colours = new HashMap<>();
        colours.put(1,"red");
        colours.put(2,"green");
        colours.put(3,"black");
        colours.put(4,"white");
        colours.put(5,"blue");

    //printing index + value of it
        for (int index = 1 ; index < colours.size()+1; index++){
            System.out.print(index + " " + colours.get(index) + " | ");
        }

    }
}
