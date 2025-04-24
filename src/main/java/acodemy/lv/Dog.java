package acodemy.lv;

public class Dog {
    private String name;
    private int age;
    private String breedName = "unknown breed";

    public Dog(String breedName) {
        this.breedName = breedName;
    }

    public Dog() {
    }

    public Dog(String name, int age, String breedName) {
        this.name = name;
        this.age = age;
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }

    void bark() {
        System.out.println(name + " woof");
    }


    void feed() {
        System.out.println(name + " is eating some food");
    }

    // Getter & Setter


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }






    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
