/*wap to print the pattern
 *      1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1 */
import java.util.Scanner;
public class pyramid14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = row - 1;
        int star = 1;

        for (int i = 1; i <= row; i++) {
            int a=1;
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
            space--;
            star += 2;
            System.out.println();

        }

    }
}

