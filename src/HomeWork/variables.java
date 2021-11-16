package HomeWork;

import java.util.Arrays;

public class variables {
    public static void main (String[] args){
        /* store a country's name in a variable.
        * Data Type: string
        * All the values that will be stored in an Array
   */

        String[] europeanCountry = new String[1];
        europeanCountry[0]="England";

        System.out.println(Arrays.toString(europeanCountry));

        /*
         * Print the length of country name.
         * length is int value
         *
         */
        int lengthOfCountryName= europeanCountry.length-1;
        System.out.println(lengthOfCountryName);

        /*
        *Print number of words in a given string
        * string1="Health was Earlier said to be the ability of the body functioning Well;
        *
         */
        String[] stringHealth={"Health was Earlier said to be the ability of the body functioning Well"};
        String[] afterSplit_Space=stringHealth.split[""];
        System.out.println("The health string ");
        int numberOfWords= afterSplit_Space.length;
        System.out.println("\n The number of words in string 1 are :  "  + numberOfWords);
    }

}
