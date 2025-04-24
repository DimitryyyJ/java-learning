package acodemy.lv;

import java.util.Scanner;

public class W3Schools {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект Scanner
        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // считываем целое число
        System.out.println("Вы ввели: " + number);
    }

}
