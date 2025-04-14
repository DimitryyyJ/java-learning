package acodemy.lv;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        // Array
        // значение одного и того же типа

        int[] numbers = new int[5]; // [0,0,0,0,0}
        String[] names = {"John", "Anfrew", "Mark"}; // [John, Andrew, Mark ]

        int[] ages = {19, 20, 30, 41, 50};




        // Element access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));

        // Exercise
        String[] fruitBasket = new String[10];
        fruitBasket[0] = "Pineapple";
        fruitBasket[1] = "Milk";
        fruitBasket[2] = "Sausages";
        fruitBasket[3] = "Apples";
        fruitBasket[4] = "Corn";
        fruitBasket[5] = "Green apples";
        fruitBasket[6] = "Berries";
        fruitBasket[7] = "Meat balls";
        fruitBasket[8] = "Lemon";
        fruitBasket[9] = "Lime";
        System.out.println(Arrays.toString(fruitBasket));


        var currentDay = 14;


        // Loops
        // Print hello world 5 times
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        // for loop
        /*
        for(counter; condition; increment)
         */
        for(int i =0; i < 5; i++) {
            System.out.println("Hello world");
        }

        for(int i = 0; i < fruitBasket.length; i++){
            System.out.println(fruitBasket[i]);
        }

        // for each;
        for(String fruit: fruitBasket) {
            System.out.println(fruit);
        }

        // Create int number array from 0 -> to 10
        // Print in reverse order

        int[] numArray = {0,1,2,3,4,5,6,7,8,9,10};
        for(int i = numArray.length - 1; i > 0; i--) {
            System.out.print(numArray[i] + " ");

        }




        // Concatenation
        String myName = "Nikita";
        String mySurname = "Milka";
        int myAge = 30;
        // My name is Nikita Milka. I am 30 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". I am " + myAge + "years old.");

        System.out.println(
                String.format("My name is %s %s. I am %d years old", myName, mySurname, myAge));


        String template = """
                My name is %s %s. I am %d years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));



        // while loops
        /*
        while(condition) {
           loop body
        }
         */

//        int i = 0;
//        while(i<5) {
//            System.out.println("Number: " + i);
//            i++;
//        }


        Scanner scanner = new Scanner(System.in);
        String password = "";


        /*
        String password = "123"
        password.equals("123) = true!
        !password.equals("123") = false
         */

//        while (!password.equals("secret")) {
//            System.out.println("Enter your password: ");
//            password = scanner.nextLine();
//        }
//        System.out.println("Access granted!");


//        int guessedNumber = 10;
//        int guess;
//        Scanner myScanner = new Scanner(System.in);
//        do {
//            System.out.println("Guess number from 1 to 10");
//            guess = myScanner.nextInt();
//        } while (guess != guessedNumber);
//
//        System.out.println("Guessed!");

        // vivesti tablicu umnozhenoja na 5 do 10

        for(int i = 1; i<11; i++) {
            System.out.println("5*"+i+"="+(i*5));
        }

        // While: vivesti chisla ot 10 do 1;
        int j = 1;
        while(j<11) {
            System.out.println(11-j);
            j++;
        }

        // Poschitatj summu chisel ot 1 do 100
        int summa = 0;
        for(int i = 1; i < 101; i++) {
            summa = i + summa;
        }
        System.out.println(summa);

    }
}
