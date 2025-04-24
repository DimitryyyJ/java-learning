package acodemy.lv;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();

        // Encapsulation
        rex.setName("Rex");
        rex.setAge(1);

        rex.bark();
        rex.feed();


        Dog barsik = new Dog("Alabai");
        barsik.setName("Barsik");
        barsik.setAge(1);


        // All argument constructor
        Dog sam = new Dog("Sam", 2, "Dolmatinec");
        System.out.println(sam);



        Car porsche = new Car("911 GT3 RS");
        System.out.println(porsche.getFuel());
        porsche.drive();
        System.out.println(porsche.getFuel());
        porsche.refuel();
        System.out.println(porsche.getFuel());
        porsche.service();
        System.out.println(porsche);

    }

}
