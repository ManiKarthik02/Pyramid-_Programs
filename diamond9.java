/*wap to print diamond pattern
 *       1
 *     1 0 1
 *   1 0 1 0 1
 *     1 0 1
 *       1
 */
import java.util.Scanner;
public class diamond9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(k%2==0){
                    System.out.print(0+" ");
                }
                else {
                    System.out.print(1 +" ");
                }
            }
            System.out.println();
            if(i<=row/2){
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }
        }
    }
}
