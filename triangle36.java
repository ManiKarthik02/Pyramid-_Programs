/*wap to print reversed right angled triangle
A A A A A
1 1 1 1
A A A
1 1
A
 * */
import java.util.Scanner;
public class triangle36 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        int n=1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(i+j<=row+1) {
                    if(i%2==0){
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print('A'+" ");
                    }
                }
                else {
                    System.out.print(" "+" " );
                }
            }
            System.out.println();
        }

    }
}

