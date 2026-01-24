package com.xworkz.Animal.external;

import com.xworkz.Animal.internal.Animal;
import com.xworkz.Animal.internal.Cat;
import com.xworkz.Animal.internal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal ani=new Dog();
        Animal an=new Cat();
        ani.animal();
        an.animal();
    }
}
