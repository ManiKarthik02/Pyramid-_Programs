/*wap to print the pattern
 *    a
    b a b
  c b a b c
d c b a b c d   */
import java.util.Scanner;
public class pyramid17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = row - 1;
        int star = 1;
        char ch='a';
        for (int i = 1; i <= row; i++) {
            char b=ch;
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if(k<=star/2){
                    System.out.print(b--+" ");
                }
                else  {
                    System.out.print(b++ +" ");
                }

            }
            ch++;
            space--;
            star += 2;
            System.out.println();

        }

    }
}


