package Lesson_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static HashSet<String> selectWordsFromText(String[] text) {
        HashSet<String> textWords = new HashSet<>();
        textWords.addAll(Arrays.asList(text));
        return textWords;
    }

    public static HashMap<String, Integer> countWordsRepeat(String[] text) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text));
        HashMap <String, Integer> wordsRepeat = new HashMap<>();

        for (int i = 0; i < words.size(); i++){
            String k = words.get(i);
            if (wordsRepeat.keySet().contains(k)){
                wordsRepeat.put(k, wordsRepeat.get(k) + 1);
            }else {
                wordsRepeat.put(k, 1);
            }
        }
        return wordsRepeat;
    }

        public static void main (String[] args){

            System.out.println("В нашем тексте следующий набор уникальных слов: " + selectWordsFromText(Text.text));
            System.out.println("В нашем тексте следующее кол-во слов: " + countWordsRepeat(Text.text));

            ArrayList<Person> persons = new ArrayList<>();
            Person person0 = new Person("Пятилайнен", "Матти", "+0-000", "patilainen@mail.fi");
            Person person1 = new Person("Шестилайнен", "Петри", "+1-111", "shestilainen@mail.fi");
            Person person2 = new Person("Семилайнен", "Йере", "+2-222", "semilainen@mail.fi");
            Person person3 = new Person("Пукканен", "Юкка", "+3-333", "j-pukkanen@mail.fi");
            Person person4 = new Person("Пукканен","Пекка", "+4-444", "p-pukkanen@mail.fi");
            Person person5 = new Person("Пукканен", "Юкка-Пекка", "+5-555", "j-p-pukkanen@mail.fi");
            persons.addAll(Arrays.asList(person0, person1, person2, person3, person4, person5));
            System.out.println(persons);
        }

    }

