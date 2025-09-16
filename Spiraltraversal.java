import java.util.*;

public class SpiralTraversal {
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

        // Spiral traversal
        int top = 0, bottom = N - 1;
        int left = 0, right = M - 1;

        while (top <= bottom && left <= right) {
            // 1. Top row (left -> right)
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // 2. Right column (top -> bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // 3. Bottom row (right -> left), if still within bounds
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4. Left column (bottom -> top), if still within bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}
