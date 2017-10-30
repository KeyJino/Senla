import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class History {

    private int bookId;
    private String name;
    private int price;
    private String date;
    private boolean status;
    private String id;

    History(String name, int price, String date, boolean status, String id){
        this.date = date;
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;

        try(FileWriter writer = new FileWriter("src\\journal.txt", true)){
            writer.write(new SimpleDateFormat("dd.MM.yyyy",
                    new Locale("en")).format(System.currentTimeMillis()));
            writer.write(name);
            writer.write(price);
            writer.write(date);
            writer.write(" " + status);
            writer.write(id);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    History(int price, boolean status, String bookId){
        this.price = price;
        this.status = status;

        try(FileWriter writer = new FileWriter("src\\journal.txt", true)){
            writer.write(new SimpleDateFormat("dd.MM.yyyy",
                    new Locale("en")).format(System.currentTimeMillis()));
            writer.write(price);
            writer.write(" " + status);
            writer.write(bookId);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
