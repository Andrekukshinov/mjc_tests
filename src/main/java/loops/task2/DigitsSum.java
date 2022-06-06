package loops.task2;

public class DigitsSum {
    public void printDigitsSum(int t){
        String stri = t + "";
        int next;
        int sum = 0;
        for (int i = 0; i < stri.length(); i++) {
            next = t / 10;
            sum += t % 10;
            t = next;
        }
        if (sum<0) System.out.println(sum/-1);
        else System.out.println(sum);
    }
}
