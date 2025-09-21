/*wap to print the reverse pyramid pattern
 * 3 c 3 c 3
     b 2 b
       1
 * */
import java.util.Scanner;
public class pyramid21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row*2-1;
        int space=0;
        char a=(char)('a'+(row-1));
        int b=row;
        int count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++) {
                if (count% 2 == 0) {
                    System.out.print(a + " ");
                    count++;
                } else {
                    System.out.print(b+ " ");
                    count++;
                }
            }
            space++;
            star=star-2;
            a--;
            b--;
            System.out.println();
        }

    }
}
