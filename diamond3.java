/*wap to print diamond pattern
 *       1
 *     2 2 2
 *   3 3 3 3 3
 *     2 2 2
 *       1
 */
import java.util.Scanner;
public class diamond3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        int a=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print(a+" ");
            }
            System.out.println();
            if(i<=row/2){
                space--;
                star+=2;
                a++;
            }
            else {
                space++;
                star-=2;
                a--;
            }
        }
    }
}
