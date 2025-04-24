package acodemy.lv;
import java.util.Scanner;

public class PezDispenser {
    private String name;
    private String color;
    private String collection;
    private int quantity = 10;

    public PezDispenser(String name, String color, String collection, int quantity) {
        this.name = name;
        this.color = color;
        this.collection = collection;
        this.quantity = quantity;
    }

    void oneCandy() {
        if (quantity ==  0){
            System.out.println("Your Pez Dispenser is empty!");
        } else if (quantity > 0) {
            System.out.println("Here is your one candy.");
            quantity = quantity - 1;
        } else {
            System.out.println("There is a mistake");
        }
    }


    void fillFull() {
        int fullDispenser = 12;
        int nedostatok = 12 - quantity;
        if (quantity == fullDispenser){
            System.out.println("Your Pez Dispenser is full!");
        } else if (quantity < 12) {
            quantity = quantity + nedostatok;
            System.out.println("Now you have " + quantity + " candy/candies in your Pez Dispenser." );
        }
    }


    void fillOneCandy() {
        if (quantity == 12){
            System.out.println("Your Pez Dispenser is full, enjoy!");
        } else if ( quantity < 12) {
            quantity = quantity + 1;
            System.out.println("Now you have " + quantity + " candy/candies in your Pez Dispenser.");
        }
    }




    void appendAsYouWish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many you want to put in? ");
        int numberToAppend = scanner.nextInt();
        int sum = quantity + numberToAppend;
        if (sum > 12) {
            System.out.println("You have " + quantity + " candies and maximum amount is 12. You cannot add " + numberToAppend);

        } else if (sum <= 12 && numberToAppend > 0 ){
            quantity = quantity + numberToAppend;
            System.out.println("Now you have " + quantity + " candies.");
        } else {
            System.out.println("You should input only positive numbers");
        }
    }


    void takeAsYouWish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many you want to take? ");
        int numberToTake = scanner.nextInt();
        int leftCandies = quantity - numberToTake;

        if(leftCandies < 0){
            System.out.println("There are not enough candies, you have " + quantity + "candies/candy.");
        } else if ( leftCandies >=0 && numberToTake > 0) {
            quantity = quantity - numberToTake;
            System.out.println("Here you are, your " + numberToTake + " candies.");
        } else {
            System.out.println("There is a mistake.");
        }
    }








    // getter & setter


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getCollection() {
        return collection;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
