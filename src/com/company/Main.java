package com.company;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

    ArrayList<Animal> animals = new ArrayList<>();

    Hund dog = new Hund("Fido", "vov");
    Cat cat = new Cat("Misser", "miav");

    animals.add(cat);
    animals.add(dog);

    for (int i = 0; i < animals.size(); i++){
      System.out.println(animals.get(i).getName());
      animals.get(i).speak();
      if (animals.get(i) instanceof Hund){
        System.out.println(animals.get(i));
      }
    }

    dog.speak();
    cat.speak();

    System.out.println(animals);
  }
}
