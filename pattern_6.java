/*wap to print pattern
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0*/
import java.util.Scanner;
public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}

