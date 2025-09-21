/*wap to print palindromic number diamond
 *        a
 *     b  a  b
 *  c  b  a  b  c
 *     b  a  b
 *        a
 */
import java.util.Scanner;
public class diamond17 {
    public static void main(String[]args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        char a='a';
        for(int i=1;i<=row;i++){
            char b=a;
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
