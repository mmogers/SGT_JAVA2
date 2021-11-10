package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Marina", 30);
        students.get("Marina"); //return 30
        students.containsKey("Marina"); //return true , such key exists
        students.containsValue(30); //returns true

        students.put("Marina", 99); //the age will be overridden;
    }
}
