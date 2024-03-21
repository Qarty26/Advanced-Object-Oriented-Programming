package immutability;

public class SO {

    private String Name;
    private String Architecture;
    private int ReleaseYear;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getArchitecture() {
        return Architecture;
    }

    public void setArchitecture(String architecture) {
        Architecture = architecture;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }


    public SO() {
    }

    public SO(String name, String architecture, int releaseYear) {
        Name = name;
        Architecture = architecture;
        ReleaseYear = releaseYear;
    }


}
