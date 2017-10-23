import java.util.*;

public class Main {

    public static void main(String[] args) {

        // This implementation is not entirely universal. I believe that if the numbers were 1000,
        // then the program had a lot of code. In this case, the arrays are better.

        int firstNum = new Random().getRandom();
        int secondNum = new Random().getRandom();
        int thirdNum = new Random().getRandom();

        System.out.println(firstNum + " " + secondNum + " " + thirdNum);

        System.out.println(new Amount(
                   new FirstDigit(firstNum).getFirstDigit(),
                   new FirstDigit(secondNum).getFirstDigit(),
                   new FirstDigit(thirdNum).getFirstDigit()
                ).getSum());

    }
}
