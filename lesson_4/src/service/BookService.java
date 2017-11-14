package service;

import bean.Book;
import stock.BookStock;
import comparators.book.*;
import comparators.book.SortBookDateRegister;

import java.util.Arrays;

public class BookService {

    private BookStock bookStock;


    public BookService(BookStock bookStock) {
        this.bookStock = bookStock;
    }


    public BookStock getBookStock() {
        return bookStock;
    }

    public Book[] sortABC(){
        Arrays.sort(bookStock.getBooks(), new SortBookABC());
        return bookStock.getBooks();
    }

    public Book[] sortDatePublication(){
        Arrays.sort(bookStock.getBooks(), new SortBookDatePublication());
        return bookStock.getBooks();
    }

    public Book[] sortPrice(){
        Arrays.sort(bookStock.getBooks(), new SortBookPrice());
        return bookStock.getBooks();
    }

    public Book[] sortStatus(){
        Arrays.sort(bookStock.getBooks(), new SortBookStatus());
        return bookStock.getBooks();
    }

    public Book[] sortRequest(){
        Arrays.sort(bookStock.getBooks(), new SortBookRequest());
        return bookStock.getBooks();
    }

    public Book[] sortUnsoldBookDate(){
        bookStock.refreshBookNotSold();
        Arrays.sort(bookStock.getBookNotSold(), new SortBookDateRegister());
        return bookStock.getBookNotSold();
    }

    public Book[] sortUnsoldBooksPrice(){
        bookStock.refreshBookNotSold();
        Arrays.sort(bookStock.getBookNotSold(), new SortBookPrice());
        return bookStock.getBookNotSold();
    }
}
