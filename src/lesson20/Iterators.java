package lesson20;
//like for each loop
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Iterators {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<String>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");

        Iterator planetIterator = planets.iterator();

        while (planetIterator.hasNext()){
            System.out.println(planetIterator.next());
        }


        Set<String> birds = new TreeSet<String>(); //also orders
        birds.add("Parrot");
        birds.add("Eagle");
        birds.add("Sparrow");
        birds.add("Pigeon");

        Iterator birdsIterator = birds.iterator();

        while (birdsIterator.hasNext()){
            System.out.println(birdsIterator.next());
        }
    }
}
