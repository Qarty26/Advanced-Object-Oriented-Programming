package interfaces.ex3;

public interface Vehicle {

    boolean hasMotor = false;
    boolean getHasMotor();

    default void printNoOfLegs() {
        System.out.println("Am motor: " + hasMotor);
    }

    static void makeNoise() {
        System.out.println("I can make noises!");
    }


}
