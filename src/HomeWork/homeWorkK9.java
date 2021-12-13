package HomeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class homeWorkK9 {
    public static void main(String[] args) {
            /**
             * create a method that can find if the given array has duplicate data or not
             * create a method that would return the values occur more than one in given string-array
             *
             * String[] words=["happy", "peace","joy", "laugh","grow","joy","laugh", "happy", "laugh", "joy"]
             * convert array into list
             * index of, last index of
             * if
             * for
             *
             */
            String[] words={"happy", "peace"," joy", "laugh"," grow","joy","laugh","happy","laugh","joy"};
            List<String> myString = new ArrayList<>();
            myString.add("happy");
            myString.add("peace");
            myString.add("joy");
            myString.add("laugh");
            myString.add("grow");
            myString.add("joy");
            myString.add("laugh");
            myString.add("happy");
            myString.add("laugh");
            myString.add("joy");
            System.out.println("\n My Array List is " + myString);
            Set<String> duplicateMyString= new HashSet<String>();


            for(String e: words ){
                if(duplicateMyString.add(e)== false){
                    System.out.println(e);
                }

            }


            List<String> myString2 = new ArrayList<>();
            myString2.add("happy");
            myString2.add("peace");
            myString2.add("joy");
            myString2.add("laugh");
            myString2.add("grow");
            myString2.add("joy");
            myString2.add("laugh");
            myString2.add("happy");
            myString2.add("laugh");
            myString2.add("joy");
            System.out.println("\n My Array List is " + myString2);
            Set<String> duplicateMyString2= new HashSet<>(myString2);
            if(duplicateMyString2.size()==myString2.size()){
                System.out.println("\n There are no Duplicate Values");
            }else{
                System.out.println("\n There are Duplicate Values");
            }}





    }

