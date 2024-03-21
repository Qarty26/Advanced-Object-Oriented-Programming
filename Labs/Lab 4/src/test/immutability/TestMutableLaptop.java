package test.immutability;

import immutability.ImmutableLaptop;
import immutability.SO;

public class TestMutableLaptop {

    public static void main(String[] args) {


        SO sisOp = new SO();
        sisOp.setReleaseYear(2020);
        sisOp.setName("Windows");
        sisOp.setArchitecture("x86");

        ImmutableLaptop immutableLaptop = new ImmutableLaptop(sisOp,2023,"gray");

        System.out.println(immutableLaptop);
        sisOp.setName("Linux");
        System.out.println(immutableLaptop);
    }
}
