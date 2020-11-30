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
public class Member {
   private String name;
   private String password;
   private String email;
   private String phone;
   private CreditCard card;
   private List<Reservation> reservations;

    public Member(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }
   
   public boolean register() {
        return false;
    }
   
   public boolean makeReservation(){
       boolean isReserved = false;
       return isReserved;
   }
   
   public boolean addCreditCard(){
       boolean isAdded = false;
       return isAdded;
   }
   
   public boolean pay(){
       boolean isPayed = false;
       return isPayed;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", card=" + card + ", reservations=" + reservations + '}';
    }
   
   
}
