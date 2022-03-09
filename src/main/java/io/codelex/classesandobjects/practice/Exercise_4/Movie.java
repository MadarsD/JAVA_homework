package io.codelex.classesandobjects.practice.Exercise_4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movie){

        Movie[] pgRated = new Movie[movie.length];
        int startingIndex = 0;
        for(int i = 0; i < movie.length; i++){
            if(movie[i].rating.equals("PG")){
                pgRated[startingIndex] = movie[i];
                startingIndex++;
            }
        }
        return pgRated;
    }

}

