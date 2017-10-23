public class Random {

    final int min = 100;
    final int max = 899;

    public int getRandom(){
        // We generate a number from 0 to 899. Then we shift the value by 100. And the final result is from 100 to 999
        return new java.util.Random().nextInt(max) + min;
    }
}
