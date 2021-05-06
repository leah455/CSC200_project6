package com.company;

//Program contains information for each movie: its MPAA rating, rating 1-5 and average rating.
public class Movie {

    private String movieName;
    private String movieRating;
    private int numTerrible;
    private int numBad;
    private int numOk;
    private int numGood;
    private int numGreat;
    private double averageRating;

    public Movie() {
        movieName = "";
        movieRating = "";
        numTerrible = 0;
        numBad = 0;
        numOk = 0;
        numGood = 0;
        numGreat = 0;
        averageRating = 0;
    }

    public void setMovieName(String name) {
        movieName = name;
    }
    public void setRating(String rating) {
        movieRating = rating;
    }

    public String getMovieName() {
        return movieName;
    }
    public String getMovieRating() {
        return movieRating;
    }

    public void addRating(int rating) {

        switch (rating) {
            case 1:
                numTerrible += 1;
                break;
            case 2:
                numBad += 1;
                break;
            case 3:
                numOk += 1;
                break;
            case 4:
                numGood += 1;
                break;
            case 5:
                numGreat += 1;
                break;
            default:
                System.out.println("Only values 1-5 are excepted as a rating");
        }
    }


    public double getAverage() {
        averageRating = ((numTerrible * 1.0) + (numBad * 2.0) + (numOk * 3.0) + (numGood * 4.0) + (numGreat * 5.0)) /
                (numTerrible + numBad + numOk + numGood + numGreat);
        return averageRating;
    }

    public static void main(String[] args){}
}
