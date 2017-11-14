package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book extends AEntity {

    private String name;

    private Boolean status;

    private int price;

    private int requestAmount;

    private Date datePublication;

    private Date dateRegister;

    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public Book(String name, int price, Date datePublication, Date dateRegister) {
        this.name = name;
        this.price = price;
        this.datePublication = datePublication;
        this.dateRegister = dateRegister;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public int getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(int requestAmount) {
        this.requestAmount = requestAmount;
    }

    public Boolean getIsMoreSixMonth() {
        Date current = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(current);
        calendar.add(Calendar.MONTH, -6);
        return calendar.getTime().after(this.dateRegister);
    }

    //@Override
    public String toString() {
        return name + " " + getId() + " " + price + " " + status + " " + dateFormat.format(datePublication) +
                " " + dateFormat.format(dateRegister);
    }


}
