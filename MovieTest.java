package com.company;

public class MovieTest {

    public static void main(String[] args) {
        Movie kingKong = new Movie();
        kingKong.setMovieName("King-Kong");
        kingKong.setRating("R");
        kingKong.addRating(4);
        kingKong.addRating(7);
        kingKong.addRating(3);
        kingKong.addRating(1);
        kingKong.addRating(2);
        System.out.println("The movie " + kingKong.getMovieName() + "'s MPAA rating is " +
                kingKong.getMovieRating());
        System.out.println("The average rating of the movie is " + kingKong.getAverage());

        Movie avatar = new Movie();
        avatar.setMovieName("Avatar");
        avatar.setRating("PG13");
        avatar.addRating(5);
        avatar.addRating(1);
        avatar.addRating(2);
        avatar.addRating(5);
        avatar.addRating(5);
        avatar.addRating(4);
        System.out.println("The movie " + avatar.getMovieName() + "'s MPAA rating is " +
                avatar.getMovieRating());
        System.out.println("The average rating of the movie is " + avatar.getAverage());
    }

}
