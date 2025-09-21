/*wap to print palindromic sand glass pattern
 * 3 2 1 2 3
 *   2 1 2
 *     1
 *   2 1 2
 * 3 2 1 2 3    */
import java.util.Scanner;
public class sandglass11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=row;
        int space=0;
        int a=row/2+1;
        for(int i=1;i<=row;i++){
            int b=a;
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(k<=star/2){
                    System.out.print(b-- +" ");
                }
                else {
                    System.out.print(b++ +" ");
                }
            }
            System.out.println();
            if(i<row/2+1){
                star-=2;
                space++;
                a--;
            }
            else {
                star+=2;
                space--;
                a++;
            }
        }
    }
}
