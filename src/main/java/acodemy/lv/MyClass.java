package acodemy.lv;

public class MyClass   {
    public static void main(String[] args) {
        System.out.println("Ja u Mami programmist!");

        // Your text is here ( one line comment )
        /*
        First line
        Second line
        Third line
         */

        // byte 8-bit
        byte age = 18;
        System.out.println(age);


        // Naming convention:
        // Camel Case: MyClass for classes ( Capital Camel Case )
        // Camel Case: currentYear for variables ( Lower Camel Case )
        // short 16-bit
        short currentYear = 2025;
        short temperature = -273;
        short distance = 1600;

        // int 32-bit
        int score = 9000;
        int population = 14400000;
        int result = (10*10)-42;
        System.out.println(result);


        // long 64-bit
        long starsInGalaxy = 100_000_000_000L; //1000000
        long bigNumber = 939393939393999L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        // float 32-bit
        float pi = 3.14f;
        float piNumber = (float) Math.PI; //casting
        float discount = 25.5f;

        // double 64-bit
        double accountBalance = 999.9999944;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;
        System.out.println(pi);
        System.out.println(piDouble);

        // char
        char initial = 'N';
        char digit = '7';
        char symbol = '*';

        // Unicode
        char smiley = '\u263A';
        System.out.println(smiley);


        // boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40 > 60); //false


        // String
        String myFullName = "Dimitrijs Jonins"; // immutable
        String mfn = new String("Nikita Milka");

    }
}
