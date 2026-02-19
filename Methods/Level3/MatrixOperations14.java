package com.gla.Methods.Level3;
import java.util.Arrays;
public class MatrixOperations14 { public static void main(String[] args) {

    int rows = 3;
    int cols = 3;

    // Generate random matrices
    int[][] matrixA = generateMatrix(rows, cols);
    int[][] matrixB = generateMatrix(rows, cols);

    System.out.println("Matrix A:");
    displayMatrix(matrixA);

    System.out.println("Matrix B:");
    displayMatrix(matrixB);

    // Addition
    int[][] sum = addMatrices(matrixA, matrixB);
    System.out.println("Sum of Matrices:");
    displayMatrix(sum);

    // Subtraction
    int[][] diff = subtractMatrices(matrixA, matrixB);
    System.out.println("Difference of Matrices:");
    displayMatrix(diff);

    // Multiplication
    int[][] prod = multiplyMatrices(matrixA, matrixB);
    System.out.println("Product of Matrices:");
    displayMatrix(prod);
}

    // a. Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10); // random 0-9
        return mat;
    }

    // Display matrix
    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.printf("%4d", val);
            System.out.println();
        }
        System.out.println();
    }

    // b. Add matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = a[i][j] + b[i][j];
        return sum;
    }

    // c. Subtract matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = a[i][j] - b[i][j];
        return diff;
    }

    // d. Multiply matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int n = a[0].length; // columns of A = rows of B
        int[][] prod = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    prod[i][j] += a[i][k] * b[k][j];
        return prod;
    }
}
