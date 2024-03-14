package animal;

public class Duck extends Bird {


    String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move()
    {
        System.out.println("let me catch up");
    }

    public Duck() {
    }

    public Duck(int noLegs, boolean mammalian, boolean hasHair, int lifeSpan, boolean canFly, String color) {
        super(noLegs, mammalian, hasHair, lifeSpan, canFly);
        this.color = color;
    }
}