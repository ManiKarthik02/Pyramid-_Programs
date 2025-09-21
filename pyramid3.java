/*wap to print pyramind pattern
 *       a
      a b c
    a b c d e
  a b c d e f g
a b c d e f g h i
 * */
import java.util.Scanner;
public class pyramid3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row =sc.nextInt();
        int star=1;
        int space=row-1;
        for (int i=1;i<=row;i++){
            char ch='a';
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print(ch+" ");
                ch++;
            }
            star+=2;
            space--;

            System.out.println();
        }
    }
}
