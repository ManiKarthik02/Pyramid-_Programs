/*wap to print diamond pattern
 *       A
 *     1 1 1
 *   A A A A A
 *     1 1 1
 *       A
 */
import java.util.Scanner;
public class diamond12 {
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
                if(i%2==0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print("A" +" ");
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
