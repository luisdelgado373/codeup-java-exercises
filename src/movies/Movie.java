package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovie() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setMovie(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {

    }
}
