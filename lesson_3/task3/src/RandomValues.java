import java.util.Random;

public class RandomValues{

    public int[] getRandomValues(int number, int price, int weight){
        int[] values = new int[3];

        // Received values ​​from the class Main, we send randomisation.
        // The data is very incorrect, because the error for all products is total.
        values[0] = new Random().nextInt(number)+ 1 + number;
        values[1] = new Random().nextInt((price) + price) * values[0];
        values[2] = new Random().nextInt((weight) + 5)  * values[0];

        // Return int[3] array, when 1 - number, 2 - priceAll, 3 - weightAll
        return values;

    }

}
