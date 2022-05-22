package loops.loopsFor;

public class Alphabet {

    /**
     * 2. Alphabet. Write a program that will write to console English alphabet.
     */
    public void printAlphabet() {
        StringBuilder result = new StringBuilder();

        for (char c = 'A'; c <= 'Z'; ++c) {
            result.append(c);
        }

        System.out.println(result);
    }
}
