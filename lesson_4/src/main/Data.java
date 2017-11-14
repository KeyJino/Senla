package main;

import service.*;
import facade.ShopBook;
import stock.*;
import java.text.ParseException;

public class Data {
    private BookStock bookStock = new BookStock();
    private BookService bookService = new BookService(bookStock);

    private OrderStock orderStock = new OrderStock();
    private OrderService orderService = new OrderService(orderStock);

    private RequestStock requestStock = new RequestStock();
    private RequestService requestService = new RequestService(requestStock, bookStock);

    public ShopBook downloadData() throws ParseException {

        ShopBook store = new ShopBook(bookService, orderService, requestService);
        store.loadShopData();
        return store;
    }



}
