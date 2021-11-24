package HomeWork;

import java.util.Arrays;

public class HOMEWORK7 {
    public static void main(String[] args) {
        /* Create a method to print the word like
         * Make America Great Again
         * Out fit of the day
         * Happy Birthday to you
         * good morning GN
         * Happy new Year
         * Happy new year to you dear
         * Happy birthday to you dear
         *
         */
        String eg1 = "Make America Great Again";
        String[] words = eg1.toUpperCase().split(" ");
        for (String w1 : words) {
            System.out.println("" + w1.charAt(0));

            String eg2 = "Outfit of the day";
            String[] words2 = eg2.toUpperCase().split(" ");
            for (String w2 : words2) {
                System.out.println(" " + w2.charAt(0));

                String eg3 = "HAppy birthday to you.";
                String[] words3 = eg3.toUpperCase().split(" ");
                for (String w3 : words3) {
                    System.out.println("  " + w3.charAt(0));
                }
                String eg4 = "good morning";
                String[] words4 = eg4.toUpperCase().split(" ");
                for (String w4 : words4) {
                    System.out.println(" " + w4.substring(0, 1));
                    String eg5 = "Happy new year to you Dear ";
                    String[] words5 = eg5.toUpperCase().split(" ");
                    for (String w5 : words5) {
                        System.out.println("  " + w5.substring(0, 1));
                        String eg6 = "HappY Birthday to you dear ";
                        String[] words6 = eg6.toUpperCase().split(" ");
                        for (String w6 : words6) {
                            System.out.println(" " + w6.substring(0, 1));
                        }

                    }


                }

            }

        }



    }};