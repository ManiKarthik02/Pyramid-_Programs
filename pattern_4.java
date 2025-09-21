/*wap to print pattern
1 2 3 4
a b c d
1 2 3 4
a b c d */
import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= col; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 0; j < col; j++) {
                    System.out.print((char) ('a' + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
