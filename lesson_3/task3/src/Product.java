
// Our main class. All products inherit it. Why abstract? Because all classes have common features, kinship among themselves.
public abstract class Product implements IDescription {

    private String name;
    private int number;
    private int price;
    private double weight;

    Product(String name, int [] values){
        this.name = name;
        this.number = values[0];
        this.price = values[1];
        this.weight = values[2];
    }

    //Name
    public String getName(){
        return name;
    }

    //Weight
    public double getWeight() {
        return weight;
    }

    //Number
    public int getNumber() {
        return number;
    }

    //Price
    public int getPrice() {
        return price;
    }

}
