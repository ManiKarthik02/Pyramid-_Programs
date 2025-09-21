
/*wap to print the pattern
* 1 0 1 0 1
* 0 1 0 1 0
* 1 0 1 0 1
* 0 1 0 1 0
* 1 0 1 0 1*/
import java.util.Scanner;
public class pattern_9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        System.out.println("enter number of columns");
        int col= sc.nextInt();
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(n--+" ");
                if(n==-1){
                    n=1;
                }
            }
            System.out.println();
        }
    }
}
