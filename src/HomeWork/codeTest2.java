import java.util.Arrays;
import java.util.HashSet;

public class codeTest2 {
    public static void main(String[] args) {
        /**
         * Create a method to return a max value from an input-int-array
         */

        int a[] = {32, 54, 12, 67, 2, 5};
        int maxValue = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }


            System.out.println("The max value in int array is   " + maxValue);


        int num2 = 5;
       int factorial=1;
       for (int j=num2; j>0;j--) {
             factorial=factorial*j;
       }
        System.out.println("\n The factorial of given number is   "+factorial);
       break;
        }
        /**
         * create a method to return the common Strings value in two input string arrays that can be of same size or different sizes
         * String A[]={"happY", "king","peace", "living standard"}
         * String b[]={"king-Kong", "Happy","PEACE"}
         */
          String [] array1={"happY", "king","peace", "living standard"};
          String[] array2={"king-Kong", "Happy","PEACE"};
          String[] array3={""};

        System.out.println("The Array ab  is   "+ Arrays.toString(array1));
        System.out.println("The Array cd  is    "+ Arrays.toString(array2));

        HashSet<String> set= new HashSet<String>();
        for(int n=0; n<=array1.length; n++){
            for (int k=0; k<=array2.length; k++){
                if (array1[n].equalsIgnoreCase(array2[k]));
                {
                    set.add(array1[n++]);
            }
            break;
        }
        System.out.println(" The common elements in both Arrays are    "+ (set));
          }
    }}



