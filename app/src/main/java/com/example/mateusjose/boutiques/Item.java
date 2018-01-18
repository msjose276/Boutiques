package com.example.mateusjose.boutiques;

import android.graphics.Bitmap;
import android.media.Image;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusjose on 1/17/18.
 */

public class Item {

    private String boutique;
    private String address;
    private String price;
    private List<Bitmap> images;

    public Item(){
        boutique="";
        address="";
        price="";
        images=new ArrayList<>();
    }

    public Item(String Boutique, String Address, String Price, List<Bitmap> List_images){
        boutique=Boutique;
        address=Address;
        price=Price;
        images=List_images;

    }
    public Item(String Price){
        price=Price;
    }

    public String getPrice() {
        return price;
    }

    public String getBoutique() {
        return boutique;
    }

    public String getAddress() {
        return address;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public void setBoutique(String boutique) {
        this.boutique = boutique;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public List<Bitmap> getImages() {
        return images;
    }

    public void setImages(List<Bitmap> images) {
        this.images = images;
    }




}
