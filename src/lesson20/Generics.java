package lesson20;

import java.util.*;

public class Generics {

    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("SomeText");
        String someText = (String) myList.get(0);

        //Equals to
        /*List<String> myList2 = new ArrayList<>();
        String someText2 = myList2.get(0);*/

        Queue<String> lidl = new LinkedList<>();
        lidl.add("A");
        lidl.add("B");
        lidl.add("C");

        Iterator lidlIterator = lidl.iterator();

        while (lidlIterator.hasNext()){
            System.out.println(lidlIterator.next());
        }



    }



}
