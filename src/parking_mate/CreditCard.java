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
public class CreditCard {
    private int number;
    private String name;
    private String expiryDate;
    private int cvv;

    public CreditCard(int number, String name, String expiryDate, int cvv) {
        this.number = number;
        this.name = name;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    
}
