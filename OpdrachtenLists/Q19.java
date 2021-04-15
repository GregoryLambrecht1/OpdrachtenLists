package opdrachtLists;

import java.util.HashMap;
import java.util.Map;

public class Q19 {
    public static void main(String[] args) {
        Map<Integer,String> colours = new HashMap<>();
        colours.put(1,"red");
        colours.put(2,"green");
        colours.put(3,"black");
        colours.put(4,"white");
        colours.put(5,"blue");
    //using .get(x) to get the value off x value
        System.out.println("the value for key 3 is : " +colours.get(3));
    }
}
