package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homeWork10{
    public static void main(String[] args) {
        /**
         *
         * Question-1:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value
         *
         * Input to method -> [ {101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"} ]
         * Output (print) ->
         *      "happy" is present with 101, 103, 106 keys
         *      "peace" is present with 102, 105 keys
         *
         * Input to method -> [ {111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"} ]
         * Output (print) ->
         */
        String[] words2= {"Happy", "peace", "Happy", "learn", "PEaCe", "HAPPY"};
        List<Integer> num=new ArrayList<>();
        num.add(101);
        num.add(102);
        num.add(103);
        num.add(104);
        num.add(105);
        num.add(105);
        System.out.println(" integer Array list --->"+ num);
        List<String> word=new ArrayList<>();
        word.add("Happy");
        word.add("peace");
        word.add("Happy");
        word.add("learn");
        word.add("PEaCe");
        word.add("HAPPY");
        System.out.println("String Array List --->  " + word);
        Map<Integer, String> dataMap = new HashMap<>();

        dataMap.put(101, "Happy");
        dataMap.put(102, "peace");
        dataMap.put(103, "Happy");
        dataMap.put(104, "learn");
        dataMap.put(105, "PEaCe");
        dataMap.put(106, "HAPPY");
        System.out.println("\nDataMap -> " + dataMap);
        System.out.println("DataMap size -> " + dataMap.size());
        boolean isPresentDuplicateValues= dataMap.containsValue("");
        System.out.println("\n Following key's have same values"    +   isPresentDuplicateValues);

        boolean keyContainsValue= dataMap.containsKey("num");
        System.out.println("\n Printing the keys of the values   "+ keyContainsValue);

        /**Question-2:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         *
         *      Map<String, Integer>
         */
        Map<String, Integer> wordsMap=new HashMap<String,Integer>();
        for (String f: words2){
            Integer count= wordsMap.get(f);{
                if(count==null){
                    wordsMap.getOrDefault(f, 1);


                }else{
                    wordsMap.put(f, ++count);
                }

            }

        }

        /**
         * Question-3:
         *
         * Create a method that will take String-array as input
         *
         * Method should return the name(s) of color present max number of times in given String array
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all
         *
         * Hint: return type as Set<String> or List<String>
         *
         */
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};










    }}




