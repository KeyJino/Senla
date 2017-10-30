
public class Stock{

    private boolean flag = false;
    private int maxWeight;
    private int weigth = 0;
    private Product[] stock = new Product[1];

    Fridge fridge = new Fridge("Fridge", 140);
    TV tv = new TV("TV", 30);
    Kettles kettles = new Kettles("Kettles", 1);
    Washer washer = new Washer("Washer", 40);
    MicrowaveOven microwaveOven = new MicrowaveOven("Microwave Oven", 7);

    Product[] products = {fridge, tv, kettles, washer, microwaveOven};

    Stock(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addProduct(){

        while ((getWeight() <= maxWeight) != flag) {
            for (int i = 0; i < products.length; i++) {
                if (weigth + products[i].getWeight() <= maxWeight) {

                    // Adding products to the stock.
                    stock = products[i].addProduct(stock, products[i]);

                    // Calculation of the weight.
                    weigth += products[i].getWeight();

                    System.out.println(products[i].getName() + " - " + weigth);
                    System.out.println();
                } else {
                    continue;
                }

            }
            // Until the stock is full
            if((getWeight() + 1 <= maxWeight) == false)
                flag = true;
        }

    }





    public int getWeight(){
        return  weigth;
    }
}
