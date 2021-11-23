package HomeWork;

import java.util.Arrays;
import java.util.Locale;

public class homeWork4 {
    public static void main (String[] args)
    {
        /* store a country's name in a variable.
         * Data Type: string
         * All the values that will be stored in an Array
         */

        String[] europeanCountry = new String[1];
        europeanCountry[0] = "England";

        System.out.println(Arrays.toString(europeanCountry));

        /*
         * Print the length of country name.
         * length is int value
         *
         */
        int lengthOfCountryName = europeanCountry.length;
        System.out.println(lengthOfCountryName);


        /*
         *Print number of words in a given string
         * string1="Health was Earlier said to be the ability of the body functioning Well;
         *
         */
        String stringHealth="Health was Earlier said to be the ability of the body functioning Well";
        int afterSplit_Space=stringHealth.length();
        System.out.println(stringHealth );

        System.out.println("\n The number of words in string 1 are :  " +afterSplit_Space);



        /*
         * Create the abbreviation for 4 letter-word sentence.
         * String[] sentA= Make America Great again
         * String[] sent 2= Outfit of the Day.
         * Happy Birthday to you
         */
        String sentA="Make America Great Again.";
        /* first split method,
        *  substring method
        * ToUppercase
        *
         */
        String[] afterSplitArray=sentA.split(" ");
        System.out.println( "Every word in sentence are:" + Arrays.toString(afterSplitArray));
        String wordsA_Make= sentA.substring(0,1);
        System.out.println(wordsA_Make.toUpperCase());
        String wordsA_America=sentA.substring(5,6);
        System.out.println(wordsA_America.toUpperCase());
        String wordsA_Great=sentA.substring(13,14);
        System.out.println(wordsA_Great.toUpperCase());
        String wordsA_Again= sentA.substring(19,20);
        System.out.println(wordsA_Again);


        String sentB= "outfit of the day";
        String[] afterSplitArray2= sentB.split(" ");
        System.out.println( "The sentence B array is :"+ Arrays.toString(afterSplitArray2));
        String word_Outfit= sentB.substring(0,1);
        System.out.println(word_Outfit.toUpperCase());
        String word_of= sentB.substring(7,8);
        System.out.println(word_of.toUpperCase());
        String word_The=sentB.substring(10,11);
        System.out.println(word_The.toUpperCase());
        String word_day= sentB.substring(14,15);
        System.out.println(word_day.toUpperCase());


        String sentC= "Happy birthday to you";
        String[] afterSplitArray3= sentC.split(" ");
        System.out.println(Arrays.toString(afterSplitArray3));
        String word_Happy= sentC.substring(0,1);
        System.out.println(word_Happy.toUpperCase());
        String word_Birthday= sentC.substring(6,7);
        System.out.println(word_Birthday.toUpperCase());
        String word_To= sentC.substring(15,16);
        System.out.println(word_To.toUpperCase());
        String word_You= sentC.substring(18,19);
        System.out.println(word_You.toUpperCase());

















        ;





    }

}


