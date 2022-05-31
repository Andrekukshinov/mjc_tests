package loops.task1;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        while (counter <= power) {
            System.out.println((int)Math.pow(2, counter));
            counter++;
        }
    }
}
