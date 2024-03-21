package immutability;

public class MutableLaptop {

    private SO SisOp;

    public SO getSisOp() {
        return SisOp;
    }

    public void setSisOp(SO sisOp) {
        SisOp = sisOp;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    private int ReleaseYear;
    private String Color;


    public MutableLaptop(SO sisOp, int releaseYear, String color) {
        SisOp = sisOp;
        ReleaseYear = releaseYear;
        Color = color;
    }
}
