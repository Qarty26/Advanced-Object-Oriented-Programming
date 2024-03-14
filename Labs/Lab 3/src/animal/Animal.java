package animal;

public class Animal {

     int noLegs;
     boolean hasHair;
     boolean mammalian;
     int lifeSpan;

    public Animal() {
    }

    public Animal(int noLegs, boolean mammalian, boolean hasHair, int lifeSpan)
    {
        this.noLegs = noLegs;
        this.mammalian = mammalian;
        this.hasHair = hasHair;
        this.lifeSpan = lifeSpan;
    }

    public int getNoLegs() {
        return noLegs;
    }
    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }
    public boolean isHasHair() {
        return hasHair;
    }
    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }
    public boolean isMammalian() {
        return mammalian;
    }
    public void setMammalian(boolean mammalian) {
        this.mammalian = mammalian;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }


//    #############################################################################################

     public void move(){
         System.out.println("Ma misc");
     }

    public void eat(){
        System.out.println("Mananc.");

    }

    public void eatStr(String food){
        System.out.println("In general mananc " + food);
    }



}

