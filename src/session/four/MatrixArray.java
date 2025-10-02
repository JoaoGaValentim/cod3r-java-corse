package session.four;

public class MatrixArray {
    public static void main(String[] args) {
        double[][] numericsMatrixA = new double[][] {
                { 1, 3, 5 },
                { 7, 9, 11 }
        };

        double[][] numericsMatrixB = new double[][] {
                { 2, 4, 6 },
                { 8, 10, 12 }
        };

        double[][] resultMatrix = new double[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] += numericsMatrixA[i][j] + numericsMatrixB[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %s ", resultMatrix[i][j]);
            }
            System.err.println();
        }
    }
}
