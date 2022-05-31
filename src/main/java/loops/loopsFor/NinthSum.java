package loops.loopsFor;

public class NinthSum {

    /**
     * 6. 9-s sum. Write a program that will display the sum of the series [ 9 + 99 + 999 + 9999 ...]
     * TODO: highlight in the task that parameter is the number of terms
     */
    public void countSum(int n) {
        int result = 0;
        int lastNumber = 0;

        for (int i = 0; i < n; ++i) {
            lastNumber = lastNumber * 10 + 9;
            result += lastNumber;
        }

        System.out.println(result);
    }
}
