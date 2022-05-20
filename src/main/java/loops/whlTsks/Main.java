package loops.whlTsks;

public class Main {
    public void powerOfTwo(int power) {
        int counter = 0;
        while (counter <= power) {
            System.out.println((int)Math.pow(2, counter));
            counter++;
        }
    }
}
