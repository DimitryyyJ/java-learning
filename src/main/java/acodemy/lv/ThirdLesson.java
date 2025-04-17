package acodemy.lv;

public class ThirdLesson {
    public static void main(String[] args) {

        // Conditional operators in Java

        // if ( is, has -> isRaining, isRandomNumber, hasEvenValue)
        boolean isRaining = false;
        boolean result = 1 < 2;

        if(isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("It is too hot!");
        }

        // AND (&&)
        if(4>2 && 10<11) {
            System.out.println("Both are equals!");
        }

        // OR (||)
        if(4>2 || 10>11) {
            System.out.println("execute this code");
        }


        // if-else ...
        boolean isWeekDay = false;
        if(!isWeekDay) {
            System.out.println("Working today...");
        } else {
            System.out.println("Will stay at home");
        }

        int number = 10;
        // % - остато кот деления

        if(number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd numbers");
        }

        int age = 18;
        if(age >= 18){
            System.out.println("Acces granted");

        } else{
            System.out.println("Access denied");
        }

        // if-else-if-else

        int hour = 7;
        if(hour==5){
            System.out.println("Will go for a run!");
        } else if (hour == 7){
            System.out.println("We will have breakfast");
        } else if ( hour == 9 ) {
            System.out.println("Free time!");
        } else {
            System.out.println("Free time");
        }



        int score = 85;
        if(score >=90){
            System.out.println("Perfect");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if ( score >= 50) {
            System.out.println("Ok");
        } else {
            System.out.println("not ok");
        }

        int agee = 1;
        if (agee >=0 && agee <= 6) {
            System.out.println("Baby");
        } else if (agee >=7 && agee <= 17) {
            System.out.println("Shkila");
        } else if ( agee >=18 && agee <=65) {
            System.out.println("Adult");
        } else {
            System.out.println("Pens");
        }

        // We know conditions and loops
        // Print even numbers from 1 to 10
        for(int i = 1; i<=10; i++){
            if(i %2 == 0) {
                System.out.println("Number: "+i+"is even number");

            } else {
                System.out.println("Number: "+i+"is not an even number");
            }
        }


        int[] numbers = {-2,-10,5,6,-100,3,0,20};
        int summa = 0;
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i]>0){
                summa = numbers[i] + summa;
            } else continue;
        } System.out.println(summa);

        int summ =0;
        for (int num: numbers) {
            if(num > 0){
                summ = summ + num;
            }
        }
        System.out.println(summ);

        int[] numberss = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i: numberss) {
            if(i%3==0 && i%5==0){
                System.out.println(i+" can be divided by 3 and 5");
            } else if(i%3==0){
                System.out.println(i+"Can be divided by 3");
            } else if(i%5==0) {
                System.out.println(i+" can be divided by 5");
            } else {
                System.out.println(i);




            }


        }
    }

    // 1 till 20,
    // print numbers that can be divided by 3 and 5
    // print divided by 3
    // print divided by 5
    // else -> just print number;



}
