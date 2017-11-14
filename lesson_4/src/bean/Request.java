package bean;

public class Request extends AEntity {

    private Book book;
    private Reader reader;


    public Request(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    //@Override
    public String toString() {
        return getId() + " " + reader.getId() + " " + book.getId() + " " + reader.getName() + " " + book.getName();
    }
}
