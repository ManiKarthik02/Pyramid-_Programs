/*wap to print palindromic number diamond
 *        1
 *     2  1  2
 *  3  2  1  2  3
 *     2  1  2
 *        1
 */
import java.util.Scanner;
public class diamond16 {
    public static void main(String[]args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        int a=1;
        for(int i=1;i<=row;i++){
            int b=a;
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++){

                if(k<star/2+1){
                    System.out.print(b+" ");
                    b--;
                }
                else {
                    System.out.print(b+" ");
                    b++;
                }
            }
            System.out.println();
            if(i<=row/2){
                star +=2;
                space--;
                a++;
            }
            else {
                star-=2;
                space++;
                a--;
            }
        }
    }
}
