package loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            int counter = i + 1;
            for (int j = 0; j < (cathetusLength) * 2; j++) {
                if (j <= (cathetusLength)) {
                    if (j >= cathetusLength - i) {
                        System.out.print(counter--);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j < cathetusLength + i + 1) {
                        System.out.print(counter++ + 2);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
