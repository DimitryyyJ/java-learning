package acodemy.lv;

public class PlayDispenser {
    public static void main(String[] args) {



        PezDispenser canddy = new PezDispenser("Blubery", "Blue", "Mario", 3);
        canddy.takeAsYouWish();
        System.out.println(canddy.getQuantity());
    }
}
