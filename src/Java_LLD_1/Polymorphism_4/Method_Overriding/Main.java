package Java_LLD_1.Polymorphism_4.Method_Overriding;

import Java_LLD_1.Contructor_Chaining_3.A;

public class Main
{
    //Method Overriding: A method with same signature and same return type present in the parent class and child class, method of child class overrides the method of parent class

    public static void main(String[] args)
    {
        //Runtime works on real object
        Animal a = new Animal();
        a.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
        dog.walk();

        Animal cat = new Cat();
        cat.makeSound();
    }

}
