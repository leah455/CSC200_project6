package com.company;

public class FlightTest {

    public static void main(String[] args) {
        Flight flight1 = new Flight("ANA", 1001, "DC", "Tokyo");
        Flight flight2 = new Flight("United", 500, "LA", "London");
        Flight flight3 = new Flight("JetBlue", 65, "Miami", "Mexico City");

        System.out.println(flight1);
        System.out.println(flight2.getFlightNumber());
        System.out.println(flight3.getAirlineName());

        flight1.setDestinationCity("Ho Chi Min");
        flight1.setFlightNumber(9054);
        System.out.println(flight1);
    }
}
