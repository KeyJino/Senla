package com.company.repository;

import com.company.bin.Book;
import com.company.bin.Entity;
import com.company.bin.Order;
import com.company.workers.ArrayWorker;

import java.util.Date;

public class BookStock extends EntityStock{
    public static Book[] books = new Book[10];

    public void addBook(Book book, BookStock bookStock, ArrayWorker arrayWorker){
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                book = books[i];


                books[i] = book;
            }
        }

    }

    public Book[] getBooks(){
        return books;
    }



    public void setBooks(Book[] books){
        this.books = books;
    }

    @Override
    public Entity[] getEntity() {
        return books;
    }
}


