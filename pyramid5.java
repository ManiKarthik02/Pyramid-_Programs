/*wap to print pyramind pattern
 *      1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
 * */
import java.util.Scanner;
public class pyramid5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row =sc.nextInt();
        int star=1;
        int space=row-1;
        int a=1;
        for (int i=1;i<=row;i++){

            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print(a+" ");

            }
            star+=2;
            space--;
            a++;
            System.out.println();
        }
    }
}
