package com.company.bin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import com.company.workers.GeneratorID;


public class Book extends Entity{

    private String name;
    private int count = 0;
    private int price;
    private boolean status;
    private Calendar date;
    private String id = new GeneratorID().generateID();

    public Book(String name, int price, boolean status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    public void setDatePublication(Calendar date){
        this.date = date;
    }

    public Calendar getDatePublication(){
        return date;
    }

    public void setDatePublication(int year, int month, int day) {
        //Calendar c = Calendar.getInstance();
        date.set(year,  month, day);
    }

    public void setId(){
       id = new GeneratorID().generateID();
    }

    public String getId(){
        return id;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + " " + price + " " + status;
    }



}
