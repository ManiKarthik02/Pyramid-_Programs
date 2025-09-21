/*wap to print pattern
 #       #
 # #   # #
 #   #   #
 #       #
 #       #
 */
import java.util.Scanner;
public class pattern_36 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        if(row%2==0)
            row++;
        System.out.println("enter number of cols");
        int col= sc.nextInt();
        if(col%2==0)
            col++;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(j==1||j==col||(i==j&&i<=row/2+1)||(i+j==row+1&&i<=row/2+1)){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
