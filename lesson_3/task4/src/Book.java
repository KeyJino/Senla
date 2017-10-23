
public class Book {
    private String name;
    private String author;
    private int number;
    private boolean marker = true;

    Book(String name, String author, int number){
        this.name = name;
        this.author = author;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setNumber(int number){this.number = number;}

    public int getNumber(){
        return number;
    }

    public void setMarker(boolean marker){
        this.marker = marker;
    }

    public boolean getMarker(){
        return marker;
    }

}
