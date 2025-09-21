/*wap to print the reverse pyramid pattern
 *  A 1 A 1 A
      A 1 A
        A
 * */
import java.util.Scanner;
public class pyramid26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row*2-1;
        int space=0;
        for(int i=1;i<=row;i++){
            char a='A';
            int b=1;
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++) {
                if (k%2 == 0) {
                    System.out.print(b+ " ");

                } else {
                    System.out.print(a+ " ");
                }
            }
            space++;
            star=star-2;
            System.out.println();
        }

    }
}
