
public class StockWeight {

    private int allWeight;

    public boolean weightFull(Product[] product, int maxWeigth){
        // At the input we get an array of products.

        for(int i = 0; i < product.length; i++){
            int weigth = 0;

            // We call a method from an abstract class
            weigth += product[i].getWeight();
            System.out.println(product[i].getName() + " - " + weigth + " kg ");

            // The whole warehouse
            allWeight += weigth;
        }

        System.out.println("All weight: " + allWeight + " kg");
        System.out.println();
        boolean b = (allWeight < maxWeigth - 20 || allWeight > maxWeigth);

        return b;
        }
    }

