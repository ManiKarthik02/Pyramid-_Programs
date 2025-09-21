/*wap to print the pattern palindromic number pyramid
 *  d c b a b c d
      c b a b c
        b a b
          a  */
import java.util.Scanner;
public class pyramid32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = 0;
        int star = row*2-1;
        char a=(char)('a'+(row-1));
        for (int i = 1; i <= row; i++) {
            char n=a;
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if(k<=star/2){
                    System.out.print(n-- +" ");
                }
                else  {
                    System.out.print(n++ +" ");
                }

            }
            space++;
            star -= 2;
            a--;
            System.out.println();

        }

    }
}

