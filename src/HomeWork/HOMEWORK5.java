package HomeWork;

public class HOMEWORK5 {
    public static void main(String[] args) {
        /* Create an int Variable and store any value in it.
         *If the Number is divisible by 5, print number is divisible by 5;
         * if the number is divisible by 3, print number is divisible by 3;
         * if the number is divisible by 15, print number is divisible by 15;
         * if the number is divisible by 5 and by 3, print number is divisible by 3 and 5;
         * If the number is not divisible by 3,5 and 15 print the value in int variable
         */
        int num = 45;
        if (num % 3 == 0) {
            System.out.println("Number is Divisible by 3 " + num % 3);
        } else if (num % 5 == 0) {
            System.out.println("Number is divisible by 5 " + num % 5);
        } else if (num % 15 == 0) {
            System.out.println("Number is divisible by 15 " + num % 15);
        }else if(num%3==0 && num%5==0) {
                 System.out.println("Number is divisible by 3 and 5");
            }
         else {
            System.out.println("Number is not divisible by 3, 5 and 15" + num);
        }
         /*
         *Create two variables to store values in student score and Max score
         * Based on the student scoring percentage print the grade
         *
          */

       int maxScore ;
        int studentScore ;
        int totalScore;

        maxScore=200;
        totalScore=180;
        studentScore= totalScore/maxScore*100;
        switch(studentScore){
            case 91-100: System.out.println("Grade A");
            break;
            case  81-89: System.out.println("Grade B");
            break;
            case  69-79: System.out.println("Grade C");
            break;
            case 59-49  : System.out.println("Grade D");
            break;

        }




    }


    };

