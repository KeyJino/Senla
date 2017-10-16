
public class Main {
    public static void main(String[] args) {

        // Generate data for verification
        RandomValues randomValues = new RandomValues();

        // Array for our warehouse products. Values ​​are prescribed and they are transferred to the random house.
        Product[] product = new Product[5];
        product[0] = new TV("TV", randomValues.getRandomValues(30, 500, 10));
        product[1] = new Fridge("Fridge", randomValues.getRandomValues(15, 700, 60));
        product[2] = new Washer("Washer", randomValues.getRandomValues(15, 700, 40));
        product[3] = new MicrowaveOven("Mircrowave Oven", randomValues.getRandomValues(20, 150, 5));
        product[4] = new Kettles("Kettles", randomValues.getRandomValues(30, 40, 2));

        // We calculate the weight and output it to the console.
        new StockWeight().weightFull(product);

    }
}
