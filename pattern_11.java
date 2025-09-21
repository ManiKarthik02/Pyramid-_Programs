
/*wap to print the pattern
*A 1 A 1 A
*1 A 1 A 1
*A 1 A 1 A
*1 A 1 A 1
*A 1 A 1 A */
import java.util.Scanner;
public class pattern_11 {
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
                    System.out.print('A'+" ");
                }
                else {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
