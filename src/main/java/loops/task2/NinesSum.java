package loops.task2;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int prev = 0;
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            prev = (int)Math.pow(10, i) * 9 + prev;
            sum += prev;
        }
        System.out.println(sum);
    }
}
