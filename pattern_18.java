/*wap to print pattern primary and secondary diagonal and boundaries
 */
import java.util.Scanner;
public class pattern_18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        if(row%2==0){
            row++;
        }
        System.out.println("Enter number of columns");
        int col= sc.nextInt();
        if(col%2==0){
            col++;
        }
        for(int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if(j+i==row+1||i==j||i==1||i==row||j==1|j==row){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
    }
}
