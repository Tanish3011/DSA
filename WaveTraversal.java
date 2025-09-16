import java.util.*;

public class WaveTraversal {
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

        // Wave Traversal
        for (int j = 0; j < M; j++) {
            if (j % 2 == 0) { // even column → top to bottom
                for (int i = 0; i < N; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else { // odd column → bottom to top
                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}
