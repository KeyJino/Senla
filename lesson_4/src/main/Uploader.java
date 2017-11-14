package main;

import facade.ShopBook;
import service.BookService;
import service.OrderService;
import service.RequestService;
import bean.Book;
import bean.Order;
import bean.Reader;
import bean.Request;
import stock.BookStock;
import stock.OrderStock;
import stock.RequestStock;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Uploader {
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Reader reader1 = new Reader("IronMan");
    private Reader reader2 = new Reader("SpiderMan");
    private Reader reader3 = new Reader("Halk");

    private Date datePublication1 = dateFormat.parse("28/03/1965");
    private Date datePublication2 = dateFormat.parse("16/02/1987");
    private Date datePublication3 = dateFormat.parse("19/02/1941");
    private Date datePublication4 = dateFormat.parse("11/01/2007");
    private Date datePublication5 = dateFormat.parse("12/10/1999");
    private Date datePublication6 = dateFormat.parse("07/05/1981");

    private Date dateRegister1 = dateFormat.parse("30/12/2010");
    private Date dateRegister2 = dateFormat.parse("17/01/2011");
    private Date dateRegister3 = dateFormat.parse("22/02/2012");
    private Date dateRegister4 = dateFormat.parse("29/06/2013");
    private Date dateRegister5 = dateFormat.parse("12/01/2014");
    private Date dateRegister6 = dateFormat.parse("25/11/2015");

    private Date dateFinish1 = dateFormat.parse("31/07/2015");
    private Date dateFinish2 = dateFormat.parse("10/09/2013");
    private Date dateFinish3 = dateFormat.parse("04/04/2011");


    private Book book1 = new Book("Batman", 2, datePublication1, dateRegister1);
    private Book book2 = new Book("Superman", 3, datePublication2, dateRegister2);
    private Book book3 = new Book("Flash", 5, datePublication3, dateRegister3);
    private Book book4 = new Book("AquaMan", 10, datePublication4, dateRegister4);
    private Book book5 = new Book("Kiborg", 7, datePublication5, dateRegister5);
    private Book book6 = new Book("WonderWomen", 7, datePublication6, dateRegister6);

    private Book[] books1 = {book1, book3, book5};
    private Book[] books2 = {book2, book4, book6};
    private Book[] books3 = {book1, book3, book4, book5, book6};

    private Order order1 = new Order(reader1, dateFinish1, books1);
    private Order order2 = new Order(reader2, dateFinish2, books2);
    private Order order3 = new Order(reader3, dateFinish3, books3);

    private Request request1 = new Request(book1, reader3);
    private Request request2 = new Request(book2, reader2);
    private Request request3 = new Request(book2, reader1);
    private Request request4 = new Request(book2, reader3);
    private Request request5 = new Request(book1, reader3);

    private BookStock bookStock = new BookStock();
    private BookService bookService = new BookService(bookStock);

    private OrderStock orderStock = new OrderStock();
    private OrderService orderService = new OrderService(orderStock);

    private RequestStock requestStock = new RequestStock();
    private RequestService requestService = new RequestService(requestStock, bookStock);

    public Uploader() throws ParseException {
    }

    public ShopBook upShopData() throws ParseException {

        ShopBook shopBook = new ShopBook(bookService, orderService, requestService);


        shopBook.addReader(reader1);
        shopBook.addReader(reader2);
        shopBook.addReader(reader3);


        shopBook.addBook(book1);
        shopBook.addBook(book2);
        shopBook.addBook(book3);
        shopBook.addBook(book4);
        shopBook.addBook(book5);
        shopBook.addBook(book6);


        shopBook.addBookStore(book1);
        shopBook.addBookStore(book2);
        shopBook.addBookStore(book5);


        shopBook.addOrder(order1);
        shopBook.addOrder(order2);
        shopBook.addOrder(order3);


        shopBook.addRequest(request1);
        shopBook.addRequest(request2);
        shopBook.addRequest(request3);
        shopBook.addRequest(request4);
        shopBook.addRequest(request5);


        return shopBook;
    }
}
