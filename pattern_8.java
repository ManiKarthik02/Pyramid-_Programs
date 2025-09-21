/*wap to print the pattern
 *1 a 2 b
 * 3 c 4 d
 * 5 e 6 f
 * 7 g 8 h*/
import java.util.Scanner;
public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();
        int n=1;
        char ch='a';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (j % 2 == 0) {
                    System.out.print(ch++ + " ");
                } else {
                    System.out.print(n+++ " ");
                }
            }
            System.out.println();
        }
    }
}


