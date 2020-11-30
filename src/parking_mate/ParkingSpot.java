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
class ParkingSpot {
    private int spotNumber;
    private boolean availability;

    public ParkingSpot(int spotNumber, boolean availability) {
        this.spotNumber = spotNumber;
        this.availability = availability;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" + "spotNumber=" + spotNumber + ", availability=" + availability + '}';
    }
    
    public boolean reserve(){
        return false;
    }
    
}
