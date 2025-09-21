/*wap to print sand glass pattern
 * 1 0 1 0 1
 *   1 0 1
 *     1
 *   1 0 1
*  1 0 1 0 1   */
import java.util.Scanner;
public class sandglass5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=row;
        int space=0;
        for(int i=1;i<=row;i++){
            int a=1;
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(k%2==0){
                    System.out.print(0 +" ");
                }
                else {
                    System.out.print(1 +" ");
                }
            }
            System.out.println();
            if(i<row/2+1){
                star-=2;
                space++;
            }
            else {
                star+=2;
                space--;
            }
        }
    }
}
