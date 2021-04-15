package opdrachtLists;

import java.util.HashMap;
import java.util.Map;

public class Q20 {
    public static void main(String[] args) {
        Map<Integer,String> colours = new HashMap<>();
        colours.put(1,"red");
        colours.put(2,"green");
        colours.put(3,"black");
        colours.put(4,"white");
        colours.put(5,"blue");

    //printing the map
        System.out.println("the map vieuw is : " + colours);
        
    //using .values to get all the values
        System.out.println("the collection view is : " + colours.values());


    }
}
