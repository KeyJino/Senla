package com.company;


import com.company.bin.Book;
import com.company.bin.Order;
import com.company.facade.Shop;
import com.company.repository.BookStock;
import com.company.repository.OrderStock;
import com.company.service.ServiceBooks;
import com.company.service.ServiceOrders;
import com.company.workers.ArrayWorker;
import com.company.workers.Printer;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {



        Shop shop = new Shop();

        ArrayWorker arrayWorker = new ArrayWorker();

        OrderStock orderStock = new OrderStock();
        BookStock bookStock = new BookStock();

        ServiceOrders serviceOrders = new ServiceOrders();
        ServiceBooks serviceBooks = new ServiceBooks();

        bookStock.addBook(new Book("Garry Potter", 40, true), bookStock, arrayWorker);
        orderStock.addOrder(new Order(40, true, bookStock.getBooks()[3], 1), orderStock, arrayWorker);

        //bookStock.setBooks(serviceBooks.addBook(new Book("Garry Potter", 40, true), bookStock, arrayWorker));
        //bookStock.setBooks(serviceBooks.addBook(new Book("Yzbek", 70, true), bookStock, arrayWorker));
        //bookStock.setBooks(serviceBooks.addBook(new Book("1001 history", 100, true), bookStock, arrayWorker));

        //orderStock.setBooks(serviceOrders.addOrder(new Order(100, true, bookStock.getBooks()[3], 1), orderStock, arrayWorker));
        //orderStock.setBooks(serviceOrders.addOrder(new Order(100, true, bookStock.getBooks()[3], 2), orderStock, arrayWorker));
        //orderStock.setBooks(serviceOrders.addOrder(new Order(100, true, bookStock.getBooks()[3], 3), orderStock, arrayWorker));

        //shop.sortingOrderByPrice();

        Printer.print(bookStock.getBooks()[0]);
        //Printer.print(bookStock.getBooks()[1]);
        //Printer.print(bookStock.getBooks()[2]);
        Printer.print(orderStock.getOrders()[0]);
        //Printer.print(orderStock.getOrders()[1]);
        //Printer.print(orderStock.getOrders()[2]);

        orderStock.getOrders()[0].getBook();

        //Printer.print(orderStock.getOrders()[2].getBook());


        //serviceOrders.showOrderThing(orderStock.getOrders()[2]);








    }
}
