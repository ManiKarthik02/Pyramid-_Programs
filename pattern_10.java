
/*wap to print the pattern
 * 1 0 1 0 1
 * 0 1 0 1 0
 * 1 0 1 0 1
 * 0 1 0 1 0
 * 1 0 1 0 1*/
import java.util.Scanner;
public class pattern_10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        System.out.println("enter number of columns");
        int col= sc.nextInt();
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
               if((i+j)%2==0){
                   System.out.print(1+" ");
               }
               else {
                   System.out.print(0+" ");
               }
            }
            System.out.println();
        }
    }
}
