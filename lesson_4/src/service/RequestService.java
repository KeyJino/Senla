package service;

import bean.Book;
import stock.BookStock;
import utility.Checker;
import bean.Request;
import stock.RequestStock;

public class RequestService {

    private RequestStock requestStock;

    private BookStock bookStock;


    public RequestService(RequestStock requestStock, BookStock bookStock) {
        this.requestStock = requestStock;
        this.bookStock = bookStock;
    }


    private int requestCount(Book book){
        int count = 0;
        for (Request request : requestStock.getRequests()) {
            if (request != null && request.getBook().equals(book)) {
                count++;
            }
        }
        return count;
    }

    public Request[] requestForBook(Book book){
        if (requestCount(book) != 0){
            Request[] bookRequests = new Request[requestCount(book)];

            for (Request request : requestStock.getRequests()) {
                if (Checker.getPosition(bookRequests) != -1 && request != null && request.getBook().equals(book)) {
                    int position = Checker.getPosition(bookRequests);
                    bookRequests[position] = request;
                }
            }
            return bookRequests;
        }
        return null;
    }

    public void setRequestAmount() {
        for (Book book: bookStock.getBooks()) {
            if (book != null) {
                book.setRequestAmount(requestCount(book));
            }
        }
    }

    public RequestStock getRequestStock() {
        return requestStock;
    }
}
