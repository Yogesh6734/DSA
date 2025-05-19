package com.designprinciples;
//
//Definition: Composition is a "has-a" relationship with strong ownership.
//The contained object (part) cannot exist independently of the container (whole).
// If the container object is destroyed, the contained objects are also destroyed.
//
//        Real-World Example:
//A car has engines. If the car is destroyed, the engine is also destroyed.
//        Analogy:
//A house has rooms. If the house is torn down, the rooms don’t exist independently.




// Car and Engine have a composition relationship.
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Strong ownership (Car owns Engine)
    }

    public void showDetails() {
        System.out.println("Car Model: " + model + ", Engine Type: " + engine.getType());
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", "Electric");
        car.showDetails(); // Car Model: Tesla Model S, Engine Type: Electric
    }
}