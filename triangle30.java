/*wap to print reversed right angled triangle
* # # # # #
* # # # #
* # # #
* # #
* #
* */
import java.util.Scanner;
public class triangle30 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(i+j<=row+1){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" " );
                }
            }
            System.out.println();
        }

    }
}

