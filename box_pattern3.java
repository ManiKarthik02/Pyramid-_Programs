/*wap to print
* a a a a
* a a a a
* a a a a
* a a a a*/
import java.util.Scanner;
public class box_pattern3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows= sc.nextInt();
        System.out.println("enter number of columns");
        int col= sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                System.out.print("a ");
            }
            System.out.println();
        }
    }
}
