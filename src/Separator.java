public class Separator {
    int[] array;
    int[] evenA;
    int[] oddA;
    public Separator(int[] array) {
        this.array = array;
        int evenQtty = 0;
        for (int i : array)  {
            if (i % 2 == 0) evenQtty++;
        }
        evenA = new int[evenQtty];
        oddA = new int[array.length - evenQtty];
    }

    public int[] even() {
        int j = 0;
        for (int i: array) {
            if (i % 2 == 0 ) evenA[j++] = i;
        }
        return evenA;
    }

    public int[] odd() {
        int j = 0;
        for (int i: array) {
            if (i % 2 != 0 ) oddA[j++] = i;
        }
        return oddA;
    }
}
