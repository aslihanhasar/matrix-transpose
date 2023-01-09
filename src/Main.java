import java.util.Scanner;

public class Main {
    static void printMatrix(int[][] arr) {

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

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
        System.out.println("Matrix: ");
        printMatrix(arr);

        int[][] transpose = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose: ");
        printMatrix(transpose);

    }
}

