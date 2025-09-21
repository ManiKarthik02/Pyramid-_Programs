/*wap to print palindromic number diamond
*        1
*     1  2  1
*  1  2  3  2  1
*     1  2  1
*        1
*/
import java.util.Scanner;
public class diamond14 {
    public static void main(String[]args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        for(int i=1;i<=row;i++){
            int a=1;
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++){
                if(k<=k/2+1){
                    System.out.print(a+" ");
                    a++;
                }
                else {
                    System.out.print(a+" ");
                    a--;
                }

            }
            System.out.println();
            if(i<=row/2){
                star +=2;
                space--;
            }
            else {
                star-=2;
                space++;
            }
        }
    }
}
