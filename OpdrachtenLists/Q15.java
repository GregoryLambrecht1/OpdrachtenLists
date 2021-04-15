package opdrachtLists;

import java.util.TreeSet;

public class Q15 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

       for (int i = 1; i <= 10; i++){
           numbers.add(i);
       }

        System.out.println("original set : " + numbers);

    //filtering the numbers that are less than 7 , than printing the tree set with all the numbers less than 7
        System.out.print("tree set data : ");
        numbers.stream().filter(number -> number <= 7)
                        .forEach(number -> System.out.print(number + " ,"));
    }
}
