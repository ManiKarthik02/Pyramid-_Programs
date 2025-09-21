/*wap to print the pattern
 *         1
 *       0 0 0
 *     1 1 1 1 1*/
import java.util.Scanner;
public class pyramid9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = row - 1;
        int star = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if (i % 2 == 0) {
                    System.out.print(0 + " ");

                    }
                else {
                    System.out.print(1 + " ");
                }
            }
            space--;
            star += 2;
            System.out.println();

        }

    }
}

