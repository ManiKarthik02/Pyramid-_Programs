/*wap to print pattern
* * * * *
*       *
*       *
*       *
* * * * *
*/
import java.util.Scanner;
public class pattern_12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        System.out.println("Enter number of columns");
        int col= sc.nextInt();
        for(int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
    }
}
