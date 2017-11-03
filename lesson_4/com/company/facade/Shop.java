package com.company.facade;

import com.company.bin.Book;
import com.company.comparators.book.compRequestToAmount;
import com.company.comparators.book.compToDatePublication;
import com.company.comparators.book.compToName;
import com.company.comparators.order.compToFinishDate;
import com.company.comparators.order.compToPrice;
import com.company.repository.BookStock;
import com.company.repository.OrderStock;
import com.company.service.ServiceBooks;
import com.company.service.ServiceOrders;
import com.company.workers.ArrayWorker;
import com.company.workers.Printer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Shop {

    public Shop() throws ParseException {
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
    ArrayWorker arrayWorker = new ArrayWorker();
    BookStock bookStock = new BookStock();
    OrderStock orderStock = new OrderStock();
    ServiceOrders serviceOrders = new ServiceOrders();


    Date dateFirst = dateFormat.parse("2014.05.12");
    Date dateSecond = dateFormat.parse("2015.10.10");


    public void sortingBookByABC(){
        Arrays.sort(bookStock.getBooks(), new com.company.comparators.book.compToPrice());
    }

    public void sortingBookByDate(){
        Arrays.sort(bookStock.getBooks(), new compToDatePublication());
    }

    public void sortingBookByName(){
        Arrays.sort(bookStock.getBooks(), new compToName());
    }

    public void sortingBookByStatus(){
        Arrays.sort(bookStock.getBooks(), new com.company.comparators.book.compToStatus());
    }

    public void sortingOrderByPrice(){
        Arrays.sort(orderStock.getOrders(), new com.company.comparators.order.compToPrice());
    }

    public void sortingOrderByStatus(){
        Arrays.sort(orderStock.getOrders(), new com.company.comparators.order.compToStatus());
    }

    public void sortingOrderByFinishDate(){
        Arrays.sort(orderStock.getOrders(), new compToFinishDate());
    }

    public void sortingRequestToAmount(){
        Arrays.sort(bookStock.getBooks(), new compRequestToAmount());
    }

    public void sortingCompletOrderByDate(){
        Arrays.sort(serviceOrders.completOrderForPeriod(orderStock.getOrders(),
                dateFirst, dateSecond, arrayWorker), new compToFinishDate());
    }

    public void sortingCompletByPrice(){
        Arrays.sort(serviceOrders.completOrderForPeriod(orderStock.getOrders(),
                dateFirst, dateSecond, arrayWorker), new compToPrice());
    }

    public void showProfit(){
        Printer.print(serviceOrders.profit(orderStock.getOrders(), dateFirst, dateSecond));
    }

    public void showCompletOrder(){
        serviceOrders.completOrderForPeriod(orderStock.getOrders(), dateFirst, dateSecond, arrayWorker);
    }

    public void showOrderThing(){
        serviceOrders.showOrderThing(orderStock.getOrders()[1]);
    }

    //описание книги
}

