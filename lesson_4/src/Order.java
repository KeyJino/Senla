import java.text.SimpleDateFormat;
import java.util.Locale;

public class Order extends AOrder {

    private String date = new SimpleDateFormat("dd.MM.yyyy",
                  new Locale("en")).format(System.currentTimeMillis());

    Order(int price, boolean status, Book book){
        super(price, status, book);
        new History(price, status, book.getId());
    }



    public String getDate(){
        return date;
    }
}
