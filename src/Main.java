import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Nhap vao so mang con: ");
        int rows = input.nextInt();
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Nhap vao so phan tu trong mang con " + i + ": ");
            int j = input.nextInt();
            matrix[i] = new int[j];
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Nhap vao phan tu trong mang con " + i + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Phan tu lon nhat trong mang vua nhap la: " + findMax(matrix));
    }


    public static int findMax(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}