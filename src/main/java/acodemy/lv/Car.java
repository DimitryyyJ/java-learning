package acodemy.lv;

public class Car {
    // fuel (0-100 0
    // mileage ( mileage in km)
    // wear ( 0 - 100 )
    // model name

    //Create all argument constructor ( fuel - 50 )

    int fuel;
    int mileage;
    int wear;
    String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
        this.fuel = 50;
        this.mileage = 0;
        this.wear = 0;
    }



    void drive() {
        // if fuel >=10 && wear < 90

        // fuel = fuel - 10
        // mileage + 50
        // wear + 10

        // else if fuel < 10 will print Not enough fuel
        // else -> car is very used!


        if(fuel >= 10 && wear < 90) {
            fuel = fuel - 10;
            mileage = mileage + 50;
            wear = wear + 10;
        } else if(fuel < 10) {
            System.out.println("Not enough fuel");
        } else {
            System.out.println("Car is very used");
        }
    }

    void refuel() {
        if(fuel < 100) {
            fuel = fuel + 30;
        } else if( fuel > 100) {
            fuel = 100;
            System.out.println("It is refueled");
        } else {
            System.out.println("It is full");
        }
    }

    void service() {
        if(wear > 0) {
            wear = wear - 30;
        } else if ( wear < 0) {
            wear = 0;
        } else {
            System.out.println("Your car does not need service");
        }
    }

    void showStatus() {
        System.out.println("Fuel: "+fuel);
        System.out.println("Wear: "+ wear);
        System.out.println("Mileage: "+mileage);
    }




    public int getFuel() {
        return fuel;
    }

    public int getWear() {
        return wear;
    }


    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", mileage=" + mileage +
                ", wear=" + wear +
                ", modelName='" + modelName + '\'' +
                '}';
    }



}
