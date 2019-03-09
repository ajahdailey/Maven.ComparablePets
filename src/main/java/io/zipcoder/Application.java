package io.zipcoder;


import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        new Application().start();
    }
    public  void start() {
        IOConsole ioConsole = new IOConsole(System.in, System.out);

        // create a list of pets
        List<Pet> petList = new ArrayList<Pet>();

        // how many pets
        Integer numberOfPets = ioConsole.getIntegerInput("How many pets do you have?");
        for (int i = 0; i < numberOfPets; i++) {
            // what kind of pet
            String typeOfPet = ioConsole.getStringInput("What kind of pet is it? [Dog or Cat]");

            // what is pet's name
            String petName = ioConsole.getStringInput("What is your pet's name?");
            Pet pet;
            if("dog".equalsIgnoreCase(typeOfPet)) {
                pet = new Dog();
            } else {
                pet = new Cat();
            }
            pet.setName(petName);
            petList.add(pet);
        }
        System.out.println(petList);
    }



}
