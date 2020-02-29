package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        System.out.println( "Hello Animal!" );

        Animal animalReference = new Animal();
        animalReference.name = "Sophie";
        animalReference.age = 10;
        animalReference.hungerLevel = 1-10;
        animalReference.mood = 1-10;
        animalReference.healthCondition = 1-10;

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.availableMoney = 1-1000;
        rescuerReference.name = "Jon";

        Food foodReference = new Food();
        foodReference.price = 100;
        foodReference.expirationDate = 100;
        foodReference.quantity = 100;
        foodReference.name = "pedigree";

        Veterinary veterinaryReference = new Veterinary();
        veterinaryReference.name = "Marcel";
        veterinaryReference.degree = "doctor";

        Recreation recreationReference = new Recreation();
        recreationReference.name = "playingcatch";

        Gameplay gameplayReference = new Gameplay();
        gameplayReference.name = "Marcel";
        gameplayReference.name ="Jon";
        gameplayReference.name = "sophie";




















    }


}
