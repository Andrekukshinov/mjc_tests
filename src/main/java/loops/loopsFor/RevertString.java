package loops.loopsFor;

public class RevertString {

    /**
     * 4. REVERT STRING. It's allowed to use only loops and no special methods.
     */
    public void revert(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; --i) {
            result.append(str.charAt(i));
        }

        System.out.println(result);
    }
}
