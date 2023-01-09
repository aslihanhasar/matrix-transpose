import java.util.Scanner;

public class Main {
    static int[][] receiveMatrix() {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        System.out.print("Enter the number of row: ");
        row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        col = scanner.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Matrix [" + (i + 1) + "]" + "[" + (j + 1) + "]" + " : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    static void printMatrix(int[][] arr) {

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int[][] matrix = receiveMatrix();
        System.out.println("Matrix: ");
        printMatrix(matrix);

        int[][] transpose = transposeMatrix(matrix);
        System.out.println("Transpose: ");
        printMatrix(transpose);
    }
}

