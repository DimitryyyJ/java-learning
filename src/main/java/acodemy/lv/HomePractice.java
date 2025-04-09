package acodemy.lv;

public class HomePractice {
    public static void main(String[]args) {
        /*
        byte - numbers from -128 to 127
        8-bit
         */
        byte temperatureOutside = 3;
        byte mathExamPercents = 98;
        byte phonePercents = 96;

        /*
        short - numbers from -32768 to 32767
        16-bit
         */
        short currentYear = 2025;
        short sunTemperature = 5778;
        short horsePower = 1200;

        /*
        int - numbers from -2147483 to 2147483647
        32-bit
         */

        int salary = 320_000;
        int latviaPopulation = 2_000_000;
        int chinaPopulation = 1_411_000_000;

        /*
        long - numbers from -9223372036854725808 to 9223372036854725808
        64-bit
         */

        long universes = 50_000_000_000_000L;
        long worldPopulation = 8_200_000_000L;
        long sandPieces = 900_000_000_000_000L;

        /*
        float - fractional numbers, 6 to 7 decimal digits
        32-bit
         */

        float division = 34.1f/5;
        float numberDivided = 5/2.2f;
        float range = 32.4f;
        float squareOfTwoFloat = (float)Math.sqrt(2);
//        System.out.println(division);

        /*
        double - fractional numbers, 15 to 16 decimal digits
        64 bit
         */

        double justCheck = 3.123456789123457d;
        System.out.println(justCheck);
        double mathSquareOfTwo = Math.sqrt(2);
        System.out.println(mathSquareOfTwo);
        System.out.println(squareOfTwoFloat);
        double dD = 30_00.1d;

        /*
        boolean - true or false values
         */

        boolean solve = 5/3>4/2;
        System.out.println(solve);
        boolean falseStatement = false;
        boolean trueStatement = true;

        /*
        char
         */

        char symbol = '0';
        char s = '\u263A';
        char f = 'f';
        System.out.println(s);

        String name = "Chris";
        String nameNew = new String("New string name");


    }
}
