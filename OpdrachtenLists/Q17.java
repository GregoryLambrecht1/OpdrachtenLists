package opdrachtLists;


import java.util.LinkedList;

public class Q17 {
    public static void main(String[] args) {
        System.out.println("1 : checks if the linked list that is given is empty (boolean)");
        System.out.println("2 : answer is false --> removeAll so all the items are gone");
        System.out.println("3 : checks again if the list is empty");
        System.out.println("4 : answer is true --> program done");
        System.out.println("5 : code must be a while loop , checking if the list is empty or not");
        System.out.println("    and in the while loop i think there is a removeAll method and it starts ");
        System.out.println("    when the list is not empty , program is finished when list is empty ");


        LinkedList<String> colours = new LinkedList<>();
        colours.add("red");
        colours.add("green");
        colours.add("black");
        colours.add("white");
        colours.add("pink");

        System.out.print("original list : ");
        System.out.println(colours);

        while (!colours.isEmpty()){
            colours.removeAll(colours);
        }
        System.out.print("list after removeall : ");
        System.out.print(colours);
    }
}
