package test;
import animal.*;


public class TestInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Ape ape = new Ape();
        ape.move();
    }

}
