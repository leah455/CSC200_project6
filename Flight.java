package com.company;

//Class that takes in airline name, flight number, origin and destination cities.

public class Flight {

    private String airlineName;
    private int flightNumber;
    private String originCity;
    private String destinationCity;

    //Constructor accepts and initializes all instance data
    public Flight(String airlineName, int flightNumber, String originCity, String destinationCity) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
    }

    public void setAirlineName(String newName) {
        airlineName = newName;
    }
    public void setFlightNumber(int newNumber) {
        flightNumber = newNumber;
    }
    public void setOriginCity(String newOrigin) {
        originCity = newOrigin;
    }
    public void setDestinationCity(String newDestination) {
        destinationCity = newDestination;
    }

    public String getAirlineName() {
        return airlineName;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public String getOriginCity() {
        return originCity;
    }
    public String getDestinationCity() {
        return destinationCity;
    }

    public String toString() {
        return airlineName + " flight number " + flightNumber + " starts at " + originCity +
                " and lands in " + destinationCity;
    }

    public static void main(String[] args) {
    }
}
