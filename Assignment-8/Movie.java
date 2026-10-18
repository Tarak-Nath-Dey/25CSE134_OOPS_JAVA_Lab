//Write a java program to create called "Movie" with attributes for title, director, actors and reviews, and methods for adding and retrieving reviews.

class Movie {
    String title;
    String director;
    String actor;
    String[] reviews;
    int reviewCount;

    Movie(String title, String director, String actor) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        reviews = new String[100];
        reviewCount = 0;
    }

    void addReview(String review) {
        reviews[reviewCount] = review;
        reviewCount++;
    }

    void getReviews() {
        System.out.println("Reviews:");

        for (int i = 0; i < reviewCount; i++) {
            System.out.println(reviews[i]);
        }
    }

    void displayMovie() {
        System.out.println("Title    : " + title);
        System.out.println("Director : " + director);
        System.out.println("Actor    : " + actor);
    }

    public static void main(String[] args) {

        Movie movie = new Movie(
            "3 Idiots",
            "Rajkumar Hirani",
            "Aamir Khan"
        );

        movie.displayMovie();

        movie.addReview("Excellent movie with a great message.");
        movie.addReview("Very inspiring and entertaining.");
        movie.addReview("One of the best Hindi movies.");

        movie.getReviews();
    }
}