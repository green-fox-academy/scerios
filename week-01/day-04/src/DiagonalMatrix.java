import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class DiagonalMatrix {

    public static void printMatrix(int matrix) {
        int[][] matrixSize;
        matrixSize = new int[matrix][matrix];

        for (int i = 0; i < matrixSize.length; i++){
            for (int j = 0; j < matrixSize.length; j++) {
                System.out.println(i + j);
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the matrix as an integer:");
        int matrix = scan.nextInt();

        printMatrix(matrix);
    }
}