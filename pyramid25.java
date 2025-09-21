/*wap to print the reverse pyramid pattern
 * A A A A A
     1 1 1
       A
 * */
import java.util.Scanner;
public class pyramid25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row*2-1;
        int space=0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++) {
                if (i%2 == 0) {
                    System.out.print(1+ " ");

                } else {
                    System.out.print('A'+ " ");
                }
            }
            space++;
            star=star-2;
            System.out.println();
        }

    }
}
