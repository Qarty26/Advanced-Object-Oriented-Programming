package test.immutability;
import immutability.*;

public class TestImmutableLaptop {


    public static void main(String[] args) {


        SO sisOp = new SO();
        sisOp.setReleaseYear(2020);
        sisOp.setName("Windows");
        sisOp.setArchitecture("x86");

        MutableLaptop immutableLaptop = new MutableLaptop(sisOp,2023,"gray");

        System.out.println(immutableLaptop);
        sisOp.setName("Linux");
        System.out.println(immutableLaptop);
    }
}
