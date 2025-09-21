/*wap to print pattern
a
b b
c c c
d d d d
e e e e e
 */
import java.util.Scanner;
public class triangle6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        char ch='a';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){

                    System.out.print(ch +" ");

            }
            System.out.println();
            ch++;
        }
    }
}
