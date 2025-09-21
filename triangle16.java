/*wap to print the pattern
 * A
 * 1 1
 * A A A
 * 1 1 1 1*/
import java.util.Scanner;
public class triangle16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++) {
                if (i % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print("A" + " ");
                }
            }
            System.out.println();
        }
    }
}
