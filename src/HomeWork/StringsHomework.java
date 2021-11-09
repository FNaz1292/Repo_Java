package HomeWork;

public class StringsHomework {
    public static void main(String[] args) {
        /*
         * string1 = "Hello dear, How are you doing?"
         *
         * result=100 if string_Length>10,
         *
         * result=150 if string_Length<10,
         *
         */
        String string1 = "Hello dear, How are you doing?";
        int string_Length = string1.length();
        System.out.println("Length of sentence"+string1+ " is "+ string_Length);
        int result= (string_Length < 10) ? 100 : 150;
        System.out.println("\n Result1: "+ result );
       /*
        * Sentence= " Health was Earlier said to be the ability of the body functioning Well."
        *
        * Find Length of the string
        *
        */
        String sentence1=" Health was Earlier said to be the ability of the body functioning well";
        int sentenceLength= sentence1.length();
        System.out.println("Healthy was earlier said to be the ability of the body functioning well is " +sentenceLength + "words Long" );

      /*
      *if sentence 1 starts with word health (Ignoring cases)
      * Pseudo code
      * convert the sentence into lower cases using toLowerCase Method
      * apply starts with method
       */
        sentence1=" Health was Earlier said to be the ability of the body functioning well";
        String sentenceLowerCase=sentence1.toLowerCase();
        System.out.println(sentenceLowerCase);
        boolean isStartsWith_health= sentenceLowerCase.startsWith ("health");
        System.out.println(sentenceLowerCase+ " starts with " +  isStartsWith_health);


        /*
        *Verify if sentence 1 contains Body Ignoring cases
        * Pseudo code
        * Convert sentence1 to lower cases by using toLowerCase method
        * Use contains() Method to find if word "Body" is present in sentence.
        *
         */
        boolean contains_Body= sentenceLowerCase.contains("body") ;
        System.out.println( sentenceLowerCase +  " contains word body " + contains_Body);

        /*
        * Index of Body in Sentence 1
        * Pseudo code
        * use IndexOf method
         */
        int indexOfBody= sentence1.indexOf("Body");
        System.out.println("\n Word Body in " + sentence1 +"is = " + indexOfBody);

        /*
        * Replace all instances of a/A with Z
        * Pseudo code
        * Convert sentence1 to upper case using toUpperCase
        * use replace method
        *
         */
        String toUpperCase1=sentence1.toUpperCase();
        String replace_A= toUpperCase1.replace("A", "z");
        System.out.println(replace_A);
    }
}


