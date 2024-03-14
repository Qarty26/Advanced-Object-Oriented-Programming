package animal;

public class Ape extends Animal {
    String race;
    private String  size;

    public Ape() {
    }

    public Ape(int noLegs, boolean mammalian, boolean hasHair, int lifeSpan, String size) {
        super(noLegs, mammalian, hasHair, lifeSpan);
        this.size = size;
    }

    @Override
    public void move()
    {
        System.out.println("still climbing");
    }
}
