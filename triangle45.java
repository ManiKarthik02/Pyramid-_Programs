/*wap to print the pattern
 *2
 *3 4
 *4 5 6  */
import java.util.Scanner;
public class triangle45 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                if(i>=j){
                        System.out.print(i+j+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
