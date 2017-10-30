
public class Stock{

    private int maxWeight;
    private int weigth = 0;
    private boolean flag = true;
    private Product[] stock = new Product[1];



    Stock(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addProduct(Product product){
                    if(isDirty(product)) {
                        setWeght(product);
                        // Adding products to the stock.
                        stock = product.addProduct(stock, product);

                        // Calculation of the weight.

                        System.out.println(product.getName() + " - " + weigth);
                        System.out.println();
                    }
                    if(getStockWeight() == maxWeight){
                        flag = false;
                    }
    }

    private void setWeght(Product product){
        weigth += product.getWeight();
    }

    public int getStockWeight(){
        return  weigth;
    }

    public boolean isFull(){
        return flag;
    }
    public boolean isDirty(Product product){
        return getStockWeight() + product.getWeight() <= maxWeight;
    }

}
