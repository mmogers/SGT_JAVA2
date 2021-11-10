package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> streets = new ArrayList<String>();

        streets.add("Struktoru");
        streets.get(0); //struktoru
        streets.add("Rupniecibas"); //index = 1
        streets.set(0,"Olivu");
        System.out.println(streets); //2 elements overrides the first elements

        streets.addAll(streets); //can add a collection
        System.out.println(streets); //duplicate


    }
}
