/*wap to print pattern
* * * *
@ @ @ @
* * * *
@ @ @ @ */
import java.util.Scanner;
public class pattern_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int rows = sc.nextInt();
        System.out.println("enter number of cols");
        int col=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                if(i%2==0) {
                    System.out.print("@ ");
                }
                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
