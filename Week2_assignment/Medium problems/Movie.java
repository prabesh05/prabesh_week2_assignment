/*Movie Details Manager Create a Movie class with attributes: name, language, rating (out of 5). Create a method displayMovieDetails().
 In main(), create 4 Movie objects and call displayMovieDetails(). */

public class Movie{
    public String name;
    public String language;
    public float rating;

    public Movie(String name, String language,float rating){
        this.name= name;
        this.language= language;
        this.rating= rating;
    }
    public void showDetails() {
        System.out.println("Name:"+this.name);
        System.out.println("Language:"+this.language);
        System.out.println("Rating:"+this.rating);
    }
    public static void main(String[] args){
Movie movie1 = new Movie("Avengers","English",8);
Movie movie2 = new Movie("Avengers Age of Ultron","English",9);
Movie movie3 = new Movie("Avengers Infinity War","English",10);
movie1.showDetails();
movie2.showDetails();
movie3.showDetails();
    }
}
