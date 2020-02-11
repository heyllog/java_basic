import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * Task 1
         */
        int[] array = { 12, 43, 12, -65, -778, 123, 32, 76 };
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        System.out.printf("Max value: %d\n", max);

        /*
         * Task 2
         */
        int[][] matrix = new int[3][3], tr_matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tr_matrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix: ");
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Transposed matrix: ");
        for (int[] i : tr_matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
