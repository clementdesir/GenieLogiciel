package com.example.jetty_jersey.ws;

public class FlightDao {
	public List<Flight> searchFlightId(int id);
	public List<Flight> searchFlightDestination(String airport);
	public List<Flight> searchFlightDate(Date date);
	public List<Flight> searchFlightPilot(int pilotId);
}
