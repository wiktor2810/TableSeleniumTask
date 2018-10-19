public class Skyscraper {


    private String structure;
    private String country;
    private String city;
    private int height;
    private int build;
    private int rank;
    private String details;

    public Skyscraper(String structure, String country, String city, int height, int build, int rank, String details) {
        this.structure = structure;
        this.country = country;
        this.city = city;
        this.height = height;
        this.build = build;
        this.rank = rank;
        this.details = details;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
}
