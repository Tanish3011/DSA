import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Input matrix
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print transpose (M x N)
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
