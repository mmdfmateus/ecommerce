/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author mmdfm
 */
public class Address {
    private String City;
    private String Estate;
    private String Neighbourhood;
    private String Number;

    public Address(String City, String Estate, String Neighbourhood, String Number) {
        this.City = City;
        this.Estate = Estate;
        this.Neighbourhood = Neighbourhood;
        this.Number = Number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getEstate() {
        return Estate;
    }

    public void setEstate(String Estate) {
        this.Estate = Estate;
    }

    public String getNeighbourhood() {
        return Neighbourhood;
    }

    public void setNeighbourhood(String Neighbourhood) {
        this.Neighbourhood = Neighbourhood;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
    
    
}
