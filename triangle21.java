/*mirror right angle triangle
         1
       2 3
     4 5 6
   7 8 9 10
* */
import java.util.Scanner;
public class triangle21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        int n=1;
        for (int i=1;i<=row;i++){

            for (int j=1;j<=row;j++){
                if (i + j >= row + 1) {
                    System.out.print(n+" ");
                    n++;
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}

