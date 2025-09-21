/*wap to print the reverse pyramid pattern
 *  c c c c c
      b b b
        a
 * */
import java.util.Scanner;
public class pyramid20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row*2-1;
        int space=0;
        char a=(char)('a'+(row-1));
        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print(a+" ");
            }
            space++;
            star=star-2;
            a--;
            System.out.println();
        }

    }
}
