package immutability;

public class ImmutableLaptop {

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


    public ImmutableLaptop(SO sisOp, int releaseYear, String color) {
        SO sisOpClone = new SO();
        sisOpClone.setName(sisOp.getName());
        sisOpClone.setArchitecture(sisOp.getArchitecture());
        sisOpClone.setReleaseYear(sisOp.getReleaseYear());
        ReleaseYear = releaseYear;
        Color = color;
    }

}
