/*wap to print diamond pattern
 *       1
 *     a b c
 *   1 2 3 4 5
 *     a b c
 *       1
 */
import java.util.Scanner;
public class diamond6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        for(int i=1;i<=row;i++){
            char a='a';
            int b=1;
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(i%2==0){
                System.out.print(a++ +" ");}
                else {
                    System.out.print(b++ +" ");
                }
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
