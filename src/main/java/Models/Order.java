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
public class Order extends IdentifiableModel {
    private int Amount;
    private Date date;
    private boolean IsComplete;
    private final UUID UserId;
    

    public Order(int Amount, Date date, boolean IsComplete, UUID UserId) {
        this.Amount = Amount;
        this.date = date;
        this.IsComplete = false;
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

    public boolean isIsComplete() {
        return IsComplete;
    }

    public void setIsComplete(boolean IsComplete) {
        this.IsComplete = IsComplete;
    }

    public UUID getUserId() {
        return UserId;
    }
    
}
