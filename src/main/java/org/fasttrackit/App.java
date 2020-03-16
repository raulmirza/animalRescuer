package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args ) {
        System.out.println("Hello Rescuer!");

        Animal animalReference = new Animal();
        animalReference.name = "Sophie";
        animalReference.age = 10;
        animalReference.hungerLevel = 1 - 10;
        animalReference.mood = 1 - 10;
        animalReference.healthCondition = 1 - 8;

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.availableMoney = 1 - 1000;
        rescuerReference.name = "Jon";

        Food foodReference = new Food();
        foodReference.price = 100;
        foodReference.expirationDate = LocalDate.of(2020, 3, 28);
        foodReference.quantity = 100;
        foodReference.name = "pedigree";


        Veterinary veterinaryReference = new Veterinary();
        veterinaryReference.name = "Marcel";
        veterinaryReference.specialization = "doctor";

        Recreation recreationReference = new Recreation();
        recreationReference.name = "playing catch";

        Game game = new Game();

        Pets pets = new Pets();

        FoodBrands foodBrands = new FoodBrands();



























    }


}
