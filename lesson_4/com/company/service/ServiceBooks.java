package com.company.service;


import com.company.bin.Book;
import com.company.bin.Entity;
import com.company.bin.Order;
import com.company.repository.BookStock;
import com.company.workers.ArrayWorker;


public class ServiceBooks{



    public Book deleteBook(Book book){

        book.setStatus(false);
        return book;

    }

    public void showDecription(Book book){

        com.company.workers.Printer.print(book.getDatePublication());
        com.company.workers.Printer.print(book.getId());
        com.company.workers.Printer.print(book.getName());
        com.company.workers.Printer.print(book.getPrice());
        com.company.workers.Printer.print(book.getStatus());

    }





}
