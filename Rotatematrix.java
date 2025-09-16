import java.util.*;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int N = sc.nextInt();

        // Input matrix
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose (swap arr[i][j] with arr[j][i])
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][N - 1 - j];
                arr[i][N - 1 - j] = temp;
            }
        }

        // Print rotated matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}