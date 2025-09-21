/*wap to print pattern
a b c d
a b c d
a b c d
a b c d*/
import java.util.Scanner;
public class pattern_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int rows = sc.nextInt();
        System.out.println("enter number of cols");
        int col=sc.nextInt();
        for (int i=1;i<=rows;i++){
            char ch='a';
            for(int j=1;j<=col;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
            System.out.println();
            }

        }
    }

