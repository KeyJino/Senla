
// Our main class. All products inherit it. Why abstract? Because all classes have common features, kinship among themselves.
public abstract class Product implements IDescription {

    private String name;
    private int weight;

    Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    //Name
    public String getName(){
        return name;
    }

    //Weight
    public int getWeight() {
        return weight;
    }

    public Product[] addProduct(Product[] stock, Product product) {
        Product[] temp = new Product[stock.length];
        System.arraycopy(stock, 0, temp, 0, temp.length);
        temp[temp.length - 1] = product;
        return temp;
    }

}
