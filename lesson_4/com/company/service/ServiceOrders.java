package com.company.service;


import com.company.bin.Book;
import com.company.bin.Order;
import com.company.repository.OrderStock;
import com.company.workers.ArrayWorker;

import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ServiceOrders {


    public void staffOrder(Order order) {

        order.setStatus(true);
        order.setReady(true);

    }

    public void cancelOrder(Order order) {

        order.setStatus(false);
        order.setReady(false);

    }

    public void stayOrder(Order order, Book book) {

        order.setStatus(false);
        order.setReady(true);
        //order.setBook(book);

    }

    public void showOrderThing(Order order){

        com.company.workers.Printer.print(order.getStatus());
        com.company.workers.Printer.print(order.getPrice());
        com.company.workers.Printer.print(order.getBook());
        com.company.workers.Printer.print(order.getFinishDate());
        com.company.workers.Printer.print(order.getNumber());

    }

    public void showCompletOrder(Order[] orders){
        int temp = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i].getStatus() == true && orders[i].getReady() == true){
                temp++;
            }
        }
        com.company.workers.Printer.print(temp);
    }

    public Order[] completOrderForPeriod(Order[] orders, Date first, Date second, ArrayWorker arrayWorker){
        Order[] temp = new Order[orders.length];

        for(int i = 0; i < orders.length; i++){
            if(orders[i].getStatus() == true && orders[i].getReady() == true
                    && orders[i].getFinishDate().before(second) == true
                    && orders[i].getFinishDate().after(first) == true){
                arrayWorker.addToArray(temp, orders[i]);
            }
        }

        return temp;
    }

    public int profit(Order[] orders, Date first, Date second){
        int temp = 0;

        for(int i = 0; i < orders.length; i++){
            if(orders[i].getStatus() == true && orders[i].getReady() == true
                    && orders[i].getFinishDate().before(second) == true
                    && orders[i].getFinishDate().after(first) == true){
                temp += orders[i].getPrice();
            }
        }

        return temp;
    }

    /*public Book[] badBook(Book[] books, Date first, Date second, ArrayWorker arrayWorker){
        Order[] temp = new Order[books.length];

        for(int i = 0; i < books.length; i++){
            if(books[i].getStatus() == true && books[i].getDatePublication()
                    && books[i].getDatePublication() > ){
                arrayWorker.addToArray(temp, orders[i]);
            }
        }

        return temp;
    }
    */



}
