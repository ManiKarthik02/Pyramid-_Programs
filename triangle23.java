/*mirror right angle triangle
         a
       b c
     d e f
   g h i j
* */
import java.util.Scanner;
public class triangle23 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        char ch='a';
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if (i + j >= row + 1) {
                    System.out.print(ch+" ");
                    ch++;
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}

