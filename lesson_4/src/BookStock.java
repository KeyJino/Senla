import java.util.Date;

public class BookStock {
    public static Book[] books = new Book[1000];
    ArrayWorker worker = new ArrayWorker();

    void addBook(String name, int price, Date date, boolean status){

                Book temp = books[worker.searchId(books)];

                temp.setName(name);
                temp.setPrice(price);
                temp.setDate(date);
                temp.setStatus(status);

                books = worker.setNewBook(books, books[worker.searchId(books)], temp);

            }

    void deleteBook(String id){

        Book temp = books[worker.searchId(books)];

        temp.setStatus(false);

        books = worker.setNewBook(books, books[worker.searchId(books)], temp);

    }



}
