package HomeWork;

import java.util.Arrays;

public class hWork5 {public class HW5 {
    public static void main (String[] args) {
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
        int lengthOfCountryName = europeanCountry.length - 1;
        System.out.println(lengthOfCountryName);


        /*
         *Print number of words in a given string
         * string1="Health was Earlier said to be the ability of the body functioning Well;
         *
         */
        String[] stringHealth={"Health was Earlier said to be the ability of the body functioning Well"};
        int afterSplit_Space=stringHealth.length-1;
        System.out.println("The health string ");
        int numberOfWords;
        numberOfWords = String[] stringHealth[].split(" " );
        System.out.println("\n The number of words in string 1 are :  "  + numberOfWords);



        /*
         * Create the abbreviation for 4 letter-word sentence.
         * String[] sentA= Make America Great again
         * String[] sent 2= Outfit of the Day.
         * Happy Birthday to you
         */
        String[] sentA={"Make America Great Again."};
        String[] wordsA=sentA.split(" ");
        System.out.println("Ist letter of every word in sentence"+sentA+"is  :  " + wordsA);





    }

}

}
