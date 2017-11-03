package com.company.repository;

import com.company.bin.Book;
import com.company.bin.Entity;
import com.company.bin.Order;
import com.company.workers.ArrayWorker;

import java.util.Date;

public class OrderStock extends EntityStock{
    private static Order[] orders = new Order[10];

    public void addOrder(Order order, OrderStock orderStock, ArrayWorker arrayWorker) {

        for(int i = 0; i < orders.length; i++) {
            if(orders[i] == null) {
                Order reader = orders[i];

                // Using basic method.


                orders[i] = reader;
            }
        }


    }

    //private Book[] books;

    /*OrderStock(Book[] books) {
        this.books = books;
    }*/
    public void setBooks(Order[] orders){
        this.orders = orders;
    }




    public Order[] getOrders(){
        return orders;
    }



    @Override
    public Entity[] getEntity() {
        return orders;
    }
}