/*wap to print a hollow reverse right angle triangle
 *         #
 *       # #
 *     #   #
 *   #     #
 * # # # # #*/
import java.util.Scanner;
public class hollow2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++) {
                if (j == row || i+j ==row+1 || i == row) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
