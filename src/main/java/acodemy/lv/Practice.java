package acodemy.lv;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int[] fiveNumbers = new int[5];
        fiveNumbers = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(fiveNumbers));

        float[] floatNumbers = new float[3];
        floatNumbers = new float[]{9.99f, 3.14f, 1.11f};
        System.out.println(floatNumbers[0]);
        System.out.println(floatNumbers[1]);
        System.out.println(floatNumbers[2]);

        String[] fruits = {"banana", "apple", "lemon", "guava"};
        for(int i = 0; i<fruits.length; i++) {
            System.out.println(i+1 + "#" + " " + fruits[i]);
        }


        int[] bigNumbers = {10,11,12,13,14,15,16,17,18,19};
        int sum = 0;
        for(int i = 0; i< bigNumbers.length; i++) {
            sum = sum + bigNumbers[i];
        }
        System.out.println(sum);

        int max = 0;
        for(int i = 0; i < bigNumbers.length; i++) {
            if (max < bigNumbers[i]) {
                max = bigNumbers[i];
            }
            else continue;
        }
        System.out.println(max);

        int min = 100_000_000;
        for(int i = 0; i < bigNumbers.length; i++) {
            if (min > bigNumbers[i]) {
                min = bigNumbers[i];
            }
            else continue;
        }
        System.out.println(min);

        int evenNumber = 0;
        for(int i = 0; i<bigNumbers.length; i++){
            if (bigNumbers[i] % 2 == 0){
                evenNumber = evenNumber + 1;
            }
        }
        System.out.println(evenNumber);


        for(int i = bigNumbers.length-1; i >=0; i--) {
            System.out.println(bigNumbers[i]);
        }

        for(int i = 0; i<bigNumbers.length; i++){
            if(bigNumbers[i] == 42) {
                System.out.println("Found it!!!");
                break;
            }
        }



        int[] justArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<=4; i++){
            System.out.println("Enter a number: ");
            int userNumber = scanner.nextInt();
            justArray[i] = userNumber;
        }
        for(int i = justArray.length-1; i>=0; i--) {
            System.out.println(justArray[i]);
        }

    }
}
