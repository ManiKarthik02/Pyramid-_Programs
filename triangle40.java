/*wap to print the pattern
 *5 e 5 e 5
 *  d 4 d 4
 *    3 c 3
 *      b 2
 *        1 */
import java.util.Scanner;
public class triangle40 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int n=row;
        char a=(char) ('a'+(row-1));
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(i<=j){
                    if(j%2==0)
                    System.out.print(a+" ");
                    else
                        System.out.print(n+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
            a--;
            n--;
        }
    }
}
