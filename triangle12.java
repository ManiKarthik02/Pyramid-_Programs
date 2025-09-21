/*wap to print the pattern
 * 1
 * 0 1
 * 0 1 0
 * 1 0 1 0*/
import java.util.Scanner;
public class triangle12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
