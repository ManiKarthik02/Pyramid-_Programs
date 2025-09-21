/*wap to print pattern
1
1 a
1 a 2
1 a 2 b
1 a 2 b 3
 */
import java.util.Scanner;
public class triangle8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        for(int i=1;i<=row;i++){
            int num=1;
            char ch='a';
            for(int j=1;j<=i;j++){
                if(j%2==0){
                System.out.print(ch +" ");
                ch++;}
                else {
                    System.out.print(num+" ");
                    num++;
                }

            }
            System.out.println();
        }
    }
}
