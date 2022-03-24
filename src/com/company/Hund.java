package com.company;

public class Hund extends Animal {

  String sound;

  public Hund(String name, String sound){
    super(name);
    this.sound = sound;
  }

  public String toString(){
    return "The animals name is " + name + " and he says " + sound + "\n";
  }

  @Override
  public void speak(){
    System.out.println(this.sound);
  }
}
