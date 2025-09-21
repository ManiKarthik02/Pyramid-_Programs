/*wap to print pattern
a
b c
d e f
g h i j
k l m n o
Floyd's alphabetic right-angle triangle
 */
import java.util.Scanner;
public class triangle7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        char ch='a';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){

                    System.out.print(ch++ +" ");

            }
            System.out.println();

        }
    }
}
