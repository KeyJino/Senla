public class Amount {
    private int sum;


    // We consider the sum of digits
    Amount(int firstDigit, int secondDigit, int thirdDigit){
        this.sum = firstDigit + secondDigit + thirdDigit;
    }
    public int getSum(){
        return sum;
    }
}
