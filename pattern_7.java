/*wap to print the pattern
* A 1 A 1
* A 1 A 1
* A 1 A 1
* A 1 A 1 */
import java.util.Scanner;
public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (j % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print('A'+ " ");
                }
            }
            System.out.println();
        }
    }
}


