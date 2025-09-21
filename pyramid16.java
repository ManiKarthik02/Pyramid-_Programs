/*wap to print the pattern
 *      1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4   */
import java.util.Scanner;
public class pyramid16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row value");
        int row = sc.nextInt();
        int space = row - 1;
        int star = 1;
        int n=1;
        for (int i = 1; i <= row; i++) {
             int a=n;
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if(k<=star/2){
                    System.out.print(a--+" ");
                }
                else  {
                    System.out.print(a++ +" ");
                }

            }
            n++;
            space--;
            star += 2;
            System.out.println();

        }

    }
}


