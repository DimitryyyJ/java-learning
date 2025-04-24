package acodemy.lv;

import org.w3c.dom.ls.LSOutput;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {
        int summa = add(1, 4);
        System.out.println(summa);

        System.out.println(add(9,10));

        greet("Nikita");

        add(10, 5, 3);
        int add = add(5,4,3);
        System.out.println(add);


        System.out.println(biggestNumbers(1,2,3,5,4, 1));

    }


    public static int add(int a, int b){
        int result = a + b;
        return result;
    }

    public static int add(int a, int b, int c){
        int rr = biggestNumbers(1, 3);
        return rr;
    }

    public static void greet(String name) {
        System.out.println("Hello,"+ name + "!");
    }


    public static int biggestNumbers(int a, int b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }


    public static int biggest(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    public static int biggestNumbers(int... num){
        int max = -100_000_000;
        for( int i = 0; i<num.length; i++){
            if ( num[i] > max){
                max = num[i];
            }
        }return max;
    }





}
