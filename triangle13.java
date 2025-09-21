/*wap to print the pattern
 * 1
 * 0 0
 * 1 1 1
 * 0 0 0 0*/
import java.util.Scanner;
public class triangle13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        int n=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n--+" ");
                if(n==-1){
                    n=1;
                }
            }
            System.out.println();
        }
    }
}
