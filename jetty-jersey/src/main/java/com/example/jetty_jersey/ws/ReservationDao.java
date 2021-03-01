package com.example.jetty_jersey.ws;

public class ReservationDao {
	public List<Reservation> getReservationId(int id);
	public void addReservation(Reservation r);
	public List<Reservation> getReservationPilot(int pilotId);
	public List<Reservation> getReservationPassenger(int passengerId);
	
	

}
