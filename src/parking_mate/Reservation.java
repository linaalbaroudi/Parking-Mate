/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_mate;

/**
 *
 *  @author lina Albaroudi, Hala Murad, Albatool Qatrangi, Shahed Alkharsah, Einas Alkharsah
 */
public class Reservation {
    private String id;
    private Member member;
    private String date;
    private String time;
    private Duration duration;
    private String userLocation; // in class diagram of type Location GPS وخرابيط
    private ParkingArea parkingArea;
    private ParkingSpot reservedSpot;
    private int totalCost;
    private boolean isConfirmed = false;

    public Reservation(String id, Member member, String date, String time, Duration duration, String userLocation, ParkingArea parkingArea, ParkingSpot reservedSpot) {
        this.id = id;
        this.member = member;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.userLocation = userLocation;
        this.parkingArea = parkingArea;
        this.reservedSpot = reservedSpot;
        setTotalCost(10); // TODO
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public ParkingArea getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(ParkingArea parkingArea) {
        this.parkingArea = parkingArea;
    }

    public ParkingSpot getReservedSpot() {
        return reservedSpot;
    }

    public void setReservedSpot(ParkingSpot reservedSpot) {
        this.reservedSpot = reservedSpot;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void ConfirmeReservation(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String reservationSummary() {
        return "Reservation{" + "date=" + date + ", time=" + time + ", duration=" + duration + ", userLocation=" + userLocation + ", parkingArea=" + parkingArea + ", reservedSpot=" + reservedSpot + ", totalCost=" + totalCost + ", isConfirmed=" + isConfirmed + '}';
    }

}
