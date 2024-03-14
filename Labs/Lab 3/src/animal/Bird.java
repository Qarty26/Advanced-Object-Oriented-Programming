package animal;

public class Bird extends Animal {

    boolean canFly;
    public boolean isCanFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird() {
    }

    public Bird(int noLegs, boolean mammalian, boolean hasHair, int lifeSpan, boolean canFly) {
        super(noLegs, mammalian, hasHair, lifeSpan);
        this.canFly = canFly;
    }

    @Override
    public void move(){
        System.out.println("HOOOLD UP");
    }
}
