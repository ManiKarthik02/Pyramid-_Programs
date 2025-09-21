/*wap to print the pattern
 *e e e e e
 *  d d d d
 *    c c c
 *      b b
 *        a */
import java.util.Scanner;
public class triangle39 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        char a=(char) ('a'+(row-1));
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(i<=j){
                    System.out.print(a+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
            a--;
        }
    }
}
