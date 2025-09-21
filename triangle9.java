/*wap to print pattern
1
a b
2 3 4
c d e f
 */
import java.util.Scanner;
public class triangle9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int num=1;
        char ch='a';
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){
                if(i%2==0){
                System.out.print(ch++ +" ");
                }
                else {
                    System.out.print(num++ +" ");
                }

            }
            System.out.println();

        }
    }
}
