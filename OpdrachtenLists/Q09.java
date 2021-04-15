package opdrachtLists;


import java.util.LinkedList;

public class Q09 {
    enum enumColours {
        RED,GREEN,BLACK,WHITE,PINK
    }
    enum enumColours2 {
        RED,GREEN,BLACK,PINK
    }

    public static void main(String[] args) {
    //making first list + adding the enum
        LinkedList<enumColours> colours1 = new LinkedList<enumColours>();
        colours1.add(enumColours.RED);
        colours1.add(enumColours.GREEN);
        colours1.add(enumColours.BLACK);
        colours1.add(enumColours.WHITE);
        colours1.add(enumColours.PINK);
        System.out.println("first list : " + colours1);

    //making second list + adding the enum
        LinkedList<enumColours2>colours2 = new LinkedList<enumColours2>();
        colours2.add(enumColours2.RED);
        colours2.add(enumColours2.GREEN);
        colours2.add(enumColours2.BLACK);
        colours2.add(enumColours2.PINK);
        System.out.println("second list : " + colours2);

    //adding first and second list to a third merged list
        LinkedList<Enum>mergedColours = new LinkedList<Enum>();
        mergedColours.addAll(colours1);
        mergedColours.addAll(colours2);
        System.out.println("merged list : " + mergedColours);

    }

}
