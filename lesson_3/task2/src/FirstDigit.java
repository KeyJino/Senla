public class FirstDigit {

    private int firstDigit;

    FirstDigit(int num){
        this.firstDigit = num;
    }

    public int getFirstDigit(){
        // We reduce the resulting number to the first digit. This is a more universal way
        while (firstDigit > 10){
            firstDigit = firstDigit/10;
        }
        return firstDigit;
    }
}
