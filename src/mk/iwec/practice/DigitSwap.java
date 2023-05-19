package mk.iwec.practice;

public class DigitSwap {

    private int number;
    private int reverse = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReverse() {
        return reverse;
    }

    public void setReverse(int reverse) {
        this.reverse = reverse;
    }

    public int swapDigits(){
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
