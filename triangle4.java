/*wap to print pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Floyd's number right-angle triangle
 */
import java.util.Scanner;
public class triangle4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){

                    System.out.print(num++ +" ");

            }
            System.out.println();

        }
    }
}
