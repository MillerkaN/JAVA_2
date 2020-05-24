package Lesson_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    public static HashMap<String, ArrayList<String[]>> doPhoneBook (ArrayList<String> persons) {
        HashMap<String, ArrayList<String[]>> pB = new HashMap<>();
        Object[] p = persons.toArray();
        for (int i = 0; i < persons.size(); i++){
            pB.put(persons.[i]);

        }
        return pB;
    }
}
