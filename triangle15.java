/*wap to print the pattern
 * A
 * 1 A
 * 1 A 1
 * A 1 A 1*/
import java.util.Scanner;
public class triangle15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        int n=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(n%2==0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print("A"+" ");
                }
                n++;
            }
            System.out.println();
        }
    }
}
