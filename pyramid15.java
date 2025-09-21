/*wap to print the pattern
 *      a
      a b a
    a b c b a
  a b c d c b a
a b c d e d c b a  */
import java.util.Scanner;
public class pyramid15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = row - 1;
        int star = 1;

        for (int i = 1; i <= row; i++) {
            char ch='a';
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if(k<=star/2){
                    System.out.print(ch++ +" ");
                }
                else  {
                    System.out.print(ch-- +" ");
                }

            }
            space--;
            star += 2;
            System.out.println();

        }

    }
}


