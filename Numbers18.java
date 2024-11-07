
import java.util.Arrays;

public class Numbers18 {
    public static void main(String[] args) {
        int myNumbers [][] = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Tambahan kode program
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // tambahan kode program 2
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjnag baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}
