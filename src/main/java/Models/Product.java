/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mmdfm
 */
public class Product extends IdentifiableModel {
    private String Category;
    private String Type;  // novo ou seminovo
    private String Description;
    private int Amount;
    private ArrayList<String> ImagesUrls;

    public Product(String Category, String Type, String Description, int Amount) {
        this.Category = Category;
        this.Type = Type;
        this.Description = Description;
        this.Amount = Amount;
        this.ImagesUrls = new ArrayList<>();
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public List<String> getImagesUrls() {
        return ImagesUrls;
    }

    public void addImageUrl(String ImageUrl) {
        this.ImagesUrls.add(ImageUrl);
    }
    
    
}
