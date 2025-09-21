/*wap to print the pattern
 * A
 * A 1
 * A 1 A
 * A 1 A 1*/
import java.util.Scanner;
public class triangle14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("A" + " ");
                } else {
                    System.out.print(1 + " ");
                }}
                System.out.println();
            }
        }
    }

