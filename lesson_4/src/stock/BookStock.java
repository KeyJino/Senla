package stock;

import utility.ArrayWorker;
import utility.Checker;
import bean.Book;

public class BookStock {

    private Book[] books = new Book[50];

    private Book[] notSoldBook;


    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBookNotSold(){
        return notSoldBook;
    }

    // TODO: 14.11.2017
    public void refreshBookNotSold(){
        int count = 0;
        for (Book book : books) {
            if (book != null && book.getIsMoreSixMonth()) {
                count++;
            }
        }
        Book[] notSoldBook = new Book[count];

        for (Book book : books) {
            if (Checker.getPosition(notSoldBook) != -1 && book != null && book.getIsMoreSixMonth()) {
                int position = Checker.getPosition(notSoldBook);
                notSoldBook[position] = book;
            }
        }
        this.notSoldBook = notSoldBook;
    }

    public void addBook(Book newBook){
        if (Checker.getPosition(books) == -1) {
            books = ArrayWorker.extendArray(books);
        }
        newBook.setStatus(false);
        int position = Checker.getPosition(books);
        books[position] = newBook;
    }

    public void addBookStore(int id){
        Book idBook = (Book) ArrayWorker.search(books, id);

        if (idBook != null){
            idBook.setStatus(true);
            refreshBook(idBook);
            return;
        }
    }

    public void removeBook(int id){
        Book idBook = (Book) ArrayWorker.search(books, id);

        if (idBook != null){
            idBook.setStatus(false);
            refreshBook(idBook);
            return;
        }
    }

    private void refreshBook(Book idBook){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == idBook.getId()) {
                books[i] = idBook;
                return;
            }
        }
    }
}
