/*wap to print the pattern
 *A 1 A 1 A
 *  A 1 A 1
 *    A 1 A
 *      A 1
 *        A  */
import java.util.Scanner;
public class triangle43 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();

        for (int i=1;i<=row;i++){
            int n=1;
            for (int j=1;j<=row;j++){
                if(i<=j){
                    if(n%2==0){
                        System.out.print(1+" ");
                        n++;}
                    else{
                        System.out.print("A"+" ");
                        n++;}
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
