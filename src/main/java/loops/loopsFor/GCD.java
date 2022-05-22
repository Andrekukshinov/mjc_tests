package loops.loopsFor;

public class GCD {

    /**
     * 3. GCD. Write a program that will find the Greatest Common Divisor (GCD) of two numbers.
     * TODO: to make task easier advice to read about Euclidean algorithm
     */
    public void findGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println(a);
    }
}
