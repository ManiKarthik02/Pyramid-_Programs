/*wap to print the pattern palindromic alphabetic pyramid
 *  a b c d c b a
      a b c b a
        a b a
          a  */
import java.util.Scanner;
public class pyramid30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = 0;
        int star = row*2-1;
        for (int i = 1; i <= row; i++) {
            char a='a';
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if(k<=star/2){
                    System.out.print(a++ +" ");
                }
                else  {
                    System.out.print(a-- +" ");
                }

            }
            space++;
            star -= 2;
            System.out.println();

        }

    }
}

