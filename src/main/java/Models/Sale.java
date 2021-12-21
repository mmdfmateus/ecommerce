/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author mmdfm
 */
public class Sale extends IdentifiableModel {
    private int Amount;
    private Date date;
    private boolean IsAvailable;
    private final UUID UserId;

    public Sale(int Amount, Date date, boolean IsAvailable, UUID UserId) {
        this.Amount = Amount;
        this.date = date;
        this.IsAvailable = true;
        this.UserId = UserId;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAvailable() {
        return IsAvailable;
    }

    public void setIsAvailable(boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

    public UUID getUserId() {
        return UserId;
    }
    
}
