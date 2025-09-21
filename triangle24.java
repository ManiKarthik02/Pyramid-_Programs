/*mirror right angle triangle
         1
       a b
     2 3 4
   d e f g
* */
import java.util.Scanner;
public class triangle24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        char ch='a';
        int n=1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if (i + j >= row + 1) {
                    if (i % 2 == 0) {
                        System.out.print(ch+" ");
                        ch++;
                    }
                    else {
                        System.out.print(n+ " ");
                        n++;
                    }
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }
}

