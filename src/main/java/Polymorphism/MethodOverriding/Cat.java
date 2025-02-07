package Polymorphism.MethodOverriding;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeNoise();
        Animal a = new Animal();
        a.makeNoise();
    }

    public void makeNoise() {
        System.out.println("Cat meows");
    }
}
