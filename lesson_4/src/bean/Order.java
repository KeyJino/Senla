package bean;

import utility.enums.TypeStatus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order extends AEntity {
    
    private Reader reader;

    private TypeStatus typeStatus;

    private Date dateFinish;

    private Book[] books;

    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public Order(Reader reader, Date dateFinish, Book[] books) {
        this.reader = reader;
        this.dateFinish = dateFinish;
        this.books = books;
        Date current = new Date();

        if (current.after(this.dateFinish)) {
            setTypeStatus(TypeStatus.FINISH);
        } else {
            setTypeStatus(TypeStatus.WAIT);
        }
    }


    public Boolean isFinish(){
        return typeStatus.equals(TypeStatus.FINISH);
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public TypeStatus getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(TypeStatus typeStatus) {
        this.typeStatus = typeStatus;
    }

    public int getPrice() {
        int price = 0;
        for (Book book: books) {
            if (book != null) {
                price += book.getPrice();
            }
        }
        return price;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

   // @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = reader.getName() + " " + getId() + " " + getTypeStatus() + " " + getPrice() + " " +
                dateFormat.format(dateFinish) + " " + books.length + " ";
        for (Book book: books) {
            stringBuilder.append(book.getId());
            stringBuilder.append(" ");
        }
        string += stringBuilder;
        return string;
    }
}
