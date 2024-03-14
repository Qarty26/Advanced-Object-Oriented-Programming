package test;

import animal.*;


public class TestEquals {

    public static void main(String[] args) {

        Ape ape1 = new Ape(4, true, true, 10, "mamut");
        Ape ape2 = new Ape(4, true, true, 10, "bathing");
        if (ape1.equals(ape2)) {
            System.out.println("Ape1 == Ape2");
        } else {
            System.out.println("Ape1 != Ape2");
        }

        //.equals() overridden
        Duck duck1 = new Duck(2,true,true,3,true,"black");
        Duck duck2 = new Duck(2,true,true,3,true,"yellow");
        if (duck1.equals(duck2)) {
            System.out.println("Duck1 == Duck2");
        } else {
            System.out.println("Duck1 != Duck2");
        }

        Ape ape3 = ape1;

        if (ape1.equals(ape3)) {
            System.out.println("Ape1 == Ape3");
        } else {
            System.out.println("Ape1 != Ape3");
        }

        if (ape1 == ape3) {
            System.out.println("Ape1 == Ape3");
        } else {
            System.out.println("Ape1 != Ape3");
        }
    }
    }

