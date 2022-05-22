package loops.loopsFor;

public class Fibonacci {

    /**
     * 7. Fibonacci. Write a program that will display the first n terms of Fibonacci series.
     * TODO: highlight in the task that each Fibonacci element should be printed at new line
     */
    public void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                System.out.println(a);
            } else if (i == 1) {
                System.out.println(b);
            } else {
                int temp = b;
                b += a;
                a = temp;
                System.out.println(b);
            }
        }
    }
}
