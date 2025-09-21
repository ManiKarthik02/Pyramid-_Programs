/*wap to print pattern
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
import java.util.Scanner;
public class triangle3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){

                    System.out.print(num +" ");
            }
            System.out.println();
            num++;
        }
    }
}
