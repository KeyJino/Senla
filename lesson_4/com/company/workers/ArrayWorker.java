package com.company.workers;

import com.company.bin.Entity;

public class ArrayWorker {

    public Entity[] addToArray(Entity[] entities, Entity entity) {

        entities[firstNullPosition(entities)] = entity;
        return entities;

    }

    private int firstNullPosition(Entity[] entities){

        int i;
        for(i = 0; i < entities.length; i++){
            if(entities[i] == null){
                break;
            }
        }
        return i;
    }

    public int searchId(Entity[] entities, Entity entity) {

        int i;
        for(i = 0; i < entities.length; i++){
            if(entities[i] == entity){
                break;
            }
        }
        return i;
    }









    /* public int searchId(Order[] orders, int number){
        int i;
        for(i = 0; i < orders.length; i++){
            if(orders[i].getItem() == number){
                break;
            }
        }
        return i;
    }

    public int searchId(Order[] orders){
        int i;
        for(i = 0; i < orders.length; i++){
            if(orders[i] == null){
                break;
            }
        }
        return i;
    }

    public int searchId(Book[] books){
        int i;
        for(i = 0; i < books.length; i++){
            if(books[i] == null){
                break;
            }
        }
        return i;
    }

    public Order[] setNewOrder(Order[] orders, Order oldOrder, Order newOrder){
        orders[searchId(orders, oldOrder.getItem())] = newOrder;
        return  orders;
    }

    public Book[] setNewBook(Book[] books, Book oldBook, Book newBook){
        books[searchId(books, oldBook.getId())] = newBook;
        return books;
    }
    */

}
