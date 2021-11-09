package Homework1;

public class HW_3 {
    public static void main(String[] args) {
        /*
         * string1 = "Hello dear, How are you doing?"
         *
         * result=100 if string_Length>10,
         *
         * result=150 if string_Length<10
         *
         */
        String string1 = "Hello dear, How are you doing?";
        int string_Lgth = 10;
        double result = string_Lgth > 10 ? 100 : 150;
        System.out.println("Length of the sentence " + string1  + result);

       /*
        * string_sent= " Health was Earlier said to be the ability of the body functioning Well."
        *
        * Find Length of the string
        *
        * Find if sentence starts with "health" (ignoring cases)
        *
        * Find if the result of the sentence contains " Body".
        *
        * Index of "Body" in sentence
        *
        */
        String string_sent=" Health was Earlier said to be the ability of the body functioning well";
        int Length = 58;
        System.out.println("Healthy was earlier said to be the ability of the body functioning well has " +   "58 words" );


        string1= " Health was Earlier said to be the ability of the body functioning well.";


    }
}


