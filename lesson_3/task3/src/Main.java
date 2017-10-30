
public class Main {
    public static void main(String[] args) {

        Fridge fridge = new Fridge("Fridge", 140);
        TV tv = new TV("TV", 30);
        Kettles kettles = new Kettles("Kettles", 1);
        Washer washer = new Washer("Washer", 40);
        MicrowaveOven microwaveOven = new MicrowaveOven("Microwave Oven", 7);

        Stock stock = new Stock(2000);

        while (stock.isFull()){
            stock.addProduct(fridge);
            stock.addProduct(tv);
            stock.addProduct(kettles);
            stock.addProduct(washer);
            stock.addProduct(microwaveOven);
        }
    }
}
