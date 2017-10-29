import java.util.Random;

public class Company {

    // If you want you can to add a new product. Just create link and add to array.
    Fridge fridge = new Fridge("Fridge", 140);
    TV tv = new TV("TV", 30);
    Kettles kettles = new Kettles("Kettles", 1);
    Washer washer = new Washer("Washer", 40);
    MicrowaveOven microwaveOven = new MicrowaveOven("Microwave Oven", 7);

    Product[] products = {fridge, tv, kettles, washer, microwaveOven};

    Company(){

        // Random MAX weight in the stock.
        Stock stock = new Stock(new Random().nextInt(10000));
        stock.addProduct(products);
    }
}
