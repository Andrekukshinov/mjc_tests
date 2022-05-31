package loops.loopsFor;

public class RangeSum {

    /**
     * 1. Range sum. Write a program that will find the sum between numbers with in the range.
     * TODO: to make task easier add to description that a should be less or equal b
     */
    public void countSum(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; ++i) {
            sum += i;
        }

        System.out.println(sum);
    }
}
