import java.util.Date;

public abstract class ABook {
    String name;
    int price;
    boolean status;
    Date date;


    ABook(String name, int price, Date date, boolean status){
        this.name = name;
        this.price = price;
        this.status = status;
        this.date = date;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setPrice(int price){
        this.price = price;
    }

    int getPrice(){
        return price;
    }

    void setStatus(Boolean status){
        this.status = status;
    }

    boolean getStatus(){
        return status;
    }

    void setDate(Date date){
        this.date = date;
    }
}
