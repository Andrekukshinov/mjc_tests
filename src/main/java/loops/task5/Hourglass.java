package loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (height / 2 > i) {
                    if (j < (height) - i && j >= i) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= (height -1) - i && j <= i) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
