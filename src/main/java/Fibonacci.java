public class Fibonacci {
    public int compute(int i) {
        if(i < 0) {
            throw new RuntimeException("Number is negative");
        } else if (i == 0 || i == 1) {
            return i;
        } else {
            return compute(i-1) + compute(i - 2);
        }
    }
}
