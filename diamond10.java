/*wap to print diamond pattern
 *       1
 *     0 1 0
 *   1 0 1 0 1
 *     0 1 0
 *       1
 */
import java.util.Scanner;
public class diamond10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=1;
        int space=row-1;
        int count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(count%2==0){
                    System.out.print(0+" ");
                    count++;
                }
                else {
                    System.out.print(1 +" ");
                    count++;
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
