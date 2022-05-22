package loops.loopsFor;

public class DigitSum {

    /**
     * 5. Digits sum. Write a program that will find the sum of digits of a given number
     * TODO: to make task easier note in the task that number is positive or 0
     */
    public void countSum(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        System.out.println(result);
    }
}
