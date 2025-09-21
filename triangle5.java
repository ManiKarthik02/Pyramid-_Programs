/*wap to print pattern
a
a b
a b c
a b c d
a b c d e
 */
import java.util.Scanner;
public class triangle5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        for(int i=1;i<=row;i++){
            char ch='a';
            for(int j=1;j<=i;j++){

                    System.out.print(ch +" ");
                    ch++;

            }
            System.out.println();
        }
    }
}
