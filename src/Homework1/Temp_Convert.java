package Homework1;



public class Temp_Convert {
    public static void main(String[] args) {
        {
            /*
             *Convert Celsius to Fahrenheit
             *FT == [CT]*9/5+ 32
             *CT=55
             */
            double cTemp = 32;
            double fTemp = (cTemp) * 9 / 5 + 32;
            System.out.println("\n Temperature converted from Celsius to Fahrenheit is " + fTemp);




            /*
             *Convert Fahrenheit to Celsius
             *cT=(fT-32)+5/9
             *fT=89.6
             */

            fTemp = 89.66;
            cTemp = (fTemp - 32) * 5 / 9;
            System.out.println("\n Temperature converted from Fahrenheit to Celsius is " + cTemp);

            /*Convert Celsius Temperature to Kelvin Temperature
             *cTemp=kTemp-273.15
             */

            double kTemp = 436;
            cTemp = kTemp - 273.15;
            System.out.println(" \n Temperature converted from Celsius to Kelvin is  " + cTemp);

            /*
             * Covert Fahrenheit Temperature to Kelvin Temperature
             * kTemp=[fTemp+459.67]*5/9
             */
            fTemp = 96.5;
            kTemp = (fTemp + 459.670) * 5 / 9;
            System.out.println("\n Temperature converted from Fahrenheit to Kelvin is     " + kTemp);


            /*
             * Covert Kelvin Temperature to Fahrenheit Temperature
             */
            kTemp = 458.60;
            fTemp = kTemp * 9 / 5 - 459.67;
            System.out.println("\n Temperature converted from Kelvin is    " + fTemp);
        }
    }
}
