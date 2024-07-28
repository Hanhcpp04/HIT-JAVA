package BUOI2.BTVN;
import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        
        
        int[] A = new int[n];
    
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
       
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) { 
                int leftNeighbor, rightNeighbor;
                if (i - 1 >= 0) {
                    leftNeighbor = A[i - 1];
                } else {
                    leftNeighbor = 0;
                }
                if (i + 1 < n) {
                    rightNeighbor = A[i + 1];
                } else {
                    rightNeighbor = 0;
                }

                A[i] += Math.abs(leftNeighbor - rightNeighbor);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        scanner.close();
    }
}
