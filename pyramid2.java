/*wap to print pyramind pattern
 *      1
 *    1 2 3
 *  1 2 3 4 5
 * */
import java.util.Scanner;
public class pyramid2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row =sc.nextInt();
        int star=1;
        int space=row-1;
        for (int i=1;i<=row;i++){
            int a=1;
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print(a+" ");
                a++;
            }
            star+=2;
            space--;

            System.out.println();
        }
    }
}
