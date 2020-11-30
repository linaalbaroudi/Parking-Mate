/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_mate;

import java.util.List;

/**
 *
 *  @author lina Albaroudi, Hala Murad, Albatool Qatrangi, Shahed Alkharsah, Einas Alkharsah
 */
class ParkingArea {
    private String location;
    private String name;
    private List<ParkingSpot> parkingSpots;

    public ParkingArea(String location, String name, List<ParkingSpot> parkingSpots) {
        this.location = location;
        this.name = name;
        this.parkingSpots = parkingSpots;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public String toString() {
        return "ParkingArea{" + "location=" + location + ", name=" + name + ", parkingSpots=" + parkingSpots + '}';
    }
    
//    public List<ParkingSpot> getAvaliableSpots(){
//        List<ParkingSpot> availableSpots;
//        return availableSpots;
//    }
}
