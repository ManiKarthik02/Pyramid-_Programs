/*wap to print pattern
1 1 1 1
a a a a
2 2 2 2
b b b b*/
import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int num = 1;
        char ch = 'a';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i % 2 != 0) {
                    System.out.print(num + " ");
                } else {
                    System.out.print(ch + " ");
                }
            }
            if (i % 2 != 0) {
                num++;
            } else {
                ch++;
            }
            System.out.println();
        }
    }
}


