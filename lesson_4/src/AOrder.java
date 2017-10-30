
public abstract class AOrder {
    int price;
    boolean status;
    Book book;
    static int counter = 0;
    private boolean isReady = false;//готов или не готов

    AOrder(int price, boolean status, Book book){
        this.price = price;
        this.status = status;//отменён или выполняется
        this.book = book;
        counter++;
    }

    void setPrice(int price){
        this.price = price;
    }

    int getPrice(){
        return price;
    }

    void setStatus(boolean status){
        this.status = status;
    }

    boolean getStatus(){
        return status;
    }

    int getItem(){
        return counter;
    }

    Book getBook(){
        return book;
    }

    void setBook(Book book){
        this.book = book;
    }

    void setReady(boolean isReady){
        this.isReady = isReady;
    }

    boolean getReady(){
        return isReady;
    }

}
