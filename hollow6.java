/*wap to print a hollow reverse pyramid
 *      # # # # # # # # #
 *        #           #
 *          #       #
 *            #   #
 *              #
 * */
import java.util.Scanner;
public class hollow6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = sc.nextInt();
        int star = row*2-1;
        int space =0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= star; k++) {
                if(k==1||k==star||i==1){
                    System.out.print("#" + " ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }

            star -= 2;
            space++;
            System.out.println();
        }
    }
}