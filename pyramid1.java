/*wap to print pyramind pattern
*      *
*    * * *
*  * * * * *
* */
import java.util.Scanner;
public class pyramid1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row =sc.nextInt();
        int star=1;
        int space=row-1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print("*"+" ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
}
