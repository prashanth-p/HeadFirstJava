package Chapter_02;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie " + this.title);
    }
}
