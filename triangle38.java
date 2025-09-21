/*wap to print the pattern
* 5 5 5 5 5
*   4 4 4 4
*     3 3 3
*       2 2
*         1*/
import java.util.Scanner;
public class triangle38 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int n=row;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(i<=j){
                    System.out.print(n+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
            n--;
        }
    }
}
