/*wap to print the reverse pyramid pattern
 * 1 0 1 0 1
     0 1 0
       1
 * */
import java.util.Scanner;
public class pyramid27 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row*2-1;
        int space=0;
        int count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++) {
                if (count% 2 == 0) {
                    System.out.print(0 + " ");
                    count++;
                } else {
                    System.out.print(1 + " ");
                    count++;
                }
            }
            space++;
            star=star-2;
            System.out.println();
        }

    }
}
