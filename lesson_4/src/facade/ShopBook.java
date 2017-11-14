package facade;

import utility.enums.TypeSort;
import service.BookService;
import service.OrderService;
import service.RequestService;
import bean.Book;
import bean.Order;
import bean.Reader;
import bean.Request;
import utility.ArrayWorker;
import utility.FileWorker;
import utility.Printer;

import java.text.ParseException;

public class ShopBook {

    private BookService bookService;

    private OrderService orderService;

    private RequestService requestService;

    private FileWorker fileWorker = new FileWorker("book.txt", "reader.txt",
            "order.txt", "request.txt");

    public ShopBook(BookService bookService, OrderService orderService, RequestService requestService) {
        this.bookService = bookService;
        this.orderService = orderService;
        this.requestService = requestService;
    }

    public void addBook(Book newBook){
        bookService.getBookStock().addBook(newBook);
    }

    public void removeBook(Book book) {
        bookService.getBookStock().removeBook(book.getId());
    }

    public void addBookStore(Book book) {
        bookService.getBookStock().addBookStore(book.getId());
    }

    public void printSortBook(TypeSort type) {
        switch (type) {
            case ABC:
                Printer.printArray(bookService.sortABC());
                break;
            case DATE:
                Printer.printArray(bookService.sortDatePublication());
                break;
            case PRICE:
                Printer.printArray(bookService.sortPrice());
                break;
            case STATUS_STORE:
                Printer.printArray(bookService.sortStatus());
                break;
        }
    }

    public void printSortUnsoldBook(TypeSort type) {
        switch (type) {
            case DATE:
                Printer.printArray(bookService.sortUnsoldBookDate());
                break;
            case PRICE:
                Printer.printArray(bookService.sortUnsoldBooksPrice());
                break;
        }
    }

    public void printBookInfo(int id) {
        Printer.print(ArrayWorker.search(bookService.getBookStock().getBooks(), id));
    }


    public void addOrder(Order order) {
        orderService.getOrderStock().addOrder(order);
    }

    public void addReader(Reader newReader){
        requestService.getRequestStock().addReader(newReader);
    }

    public void cancelOrder(Order order) {
        orderService.getOrderStock().cancelOrder(order);
    }

    public void printSortOrder(TypeSort type) {
        switch (type) {
            case DATE:
                Printer.printArray(orderService.sortOrderDate());
                break;
            case PRICE:
                Printer.printArray(orderService.sortOrderPrice());
                break;
            case STATUS:
                Printer.printArray(orderService.sortOrderStatus());
                break;
        }
    }

    public void printSortFinishOrder(TypeSort type) {
        switch (type) {
            case PRICE:
                Printer.printArray(orderService.sortFinishOrderPrice());
                break;
            case DATE:
                Printer.printArray(orderService.sortFinishOrderDate());
                break;
        }
    }

    public void printTotalOrdersPrice(){
        Printer.print(orderService.getTotalPrice());
    }

    public void printFinishOrders(){
        Printer.print(orderService.getFinishOrders());
    }

    public void printOrderInfo(int id) {
        Printer.print(ArrayWorker.search(orderService.getOrderStock().getOrders(), id));
    }


    public void printSortRequest(TypeSort type) {
        requestService.setRequestAmount();
        switch (type) {
            case AMOUNT:
                printBookRequest(bookService.sortRequest());
                break;
            case ABC:
                printBookRequest(bookService.sortABC());
                break;
        }
    }

    public void addRequest(Request request){
        requestService.getRequestStock().addRequest(request);
    }

    private void printBookRequest(Book[] books){
        System.out.println();
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getName() + " " + book.getRequestAmount());
                if (requestService.requestForBook(book) != null){
                    for (Request request : requestService.requestForBook(book)) {
                        System.out.println(request.getId() + " " + request.getReader().getName());
                    }
                }
                System.out.println("-----------------------");
            }
        }
    }


    public void saveShopData(){
        fileWorker.saveToFile(bookService.getBookStock().getBooks());
        fileWorker.saveToFile(orderService.getOrderStock().getOrders());
        fileWorker.saveToFile(requestService.getRequestStock().getReaders());
        fileWorker.saveToFile(requestService.getRequestStock().getRequests());
    }

    public void loadShopData() throws ParseException {
        bookService.getBookStock().setBooks(fileWorker.loadBooks());
        requestService.getRequestStock().setReaders(fileWorker.loadReader());
        orderService.getOrderStock().setOrders(fileWorker.loadOrders(bookService.getBookStock().getBooks()));
        requestService.getRequestStock().setRequests(fileWorker.loadRequests(bookService.getBookStock().getBooks(),
                requestService.getRequestStock().getReaders()));
    }
}
