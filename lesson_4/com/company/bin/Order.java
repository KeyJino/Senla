package com.company.bin;

import com.company.repository.OrderStock;
import com.company.workers.ArrayWorker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Order extends Entity {

    //private String date = new SimpleDateFormat("dd.MM.yyyy",
                  //new Locale("en")).format(System.currentTimeMillis());

    private Calendar date;
    private int price;
    private boolean status;
    private Book book ;
    private int counter;
    private boolean isReady = false;

    public Order(int price, boolean status, Book book, int counter){
        this.price = price;
        this.status = status;//отменён или выполняется
        this.book = book;
        this.counter = counter;
    }


    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    public int getNumber(){
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }

    public String getBook(){
        return book.getId();
    }

    public void setFinishDate(int year, int mouth, int day){
        this.date.set(year, mouth, day);
    }

    public Calendar getFinishDate(){
        return date;
   }

    //public void setBook(Book book){
      //  this.book[0] = book.getId();
    //}

    public int getCounter(){
        return counter;
    }

    public void setReady(boolean isReady){
        this.isReady = isReady;
    }

    public boolean getReady(){
        return isReady;
    }

    @Override
    public String toString() {
        return getCounter() + " " + getReady() + " " + " " + price + " " + status + " " + date;
    }
}
