/*wap to print pattern
 # # # # #
 #
 # # # # #
         #
 # # # # #
 */
import java.util.Scanner;
public class pattern_46 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        System.out.println("enter number of cols");
        int col= sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if((i==1)||(j==1&&i<=row/2+1)||(i==row)||(i==row/2+1)||(j==col&&i>row/2)){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
