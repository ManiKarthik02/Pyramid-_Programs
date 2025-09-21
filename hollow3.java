/*wap to print a mirror hollow right angle triangle
 * # # # # #
 * #     #
 * #   #
 * # #
 * #
 * */
import java.util.Scanner;
public class hollow3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++) {
                if (i == 1 || i+j ==row+1 || j == 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
