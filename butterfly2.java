/*wap to print reverse right angle triangle and mirror reverse right angle triangle pattern
 * # # # # # # # # # #
 * # # # #     # # # #
 * # # #         # # #
 * # #             # #
 * #                 #  */
import java.util.Scanner;
public class butterfly2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row;
        int space=0;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=star;j++){
                System.out.print("#"+" ");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" "+" ");
            }
            for(int l=1;l<=star;l++){
                System.out.print("#"+" ");
            }
            System.out.println();
            space+=2;
            star--;
        }
    }
}
