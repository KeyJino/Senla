import java.util.Date;
import java.util.UUID;

public class Book extends ABook{

    String id = new GeneratorID().generateID();

    Book(String name, int price, Date date, boolean status, String id) {
        super(name, price, date, status);
        this.id = id;
        new History(name.toString(), price, date.toString(), status, id.toString());
    }

    void setId(String id){
        this.id = id;
    }

    String getId(){
        return id;
    }
}
