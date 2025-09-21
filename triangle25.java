/*mirror right angle triangle
         1
       1 2
     1 2 3
   1 2 3 4
* */
import java.util.Scanner;
public class triangle25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        for (int i=1;i<=row;i++){
            int n=1;
            for (int j=1;j<=row;j++){
                if (i + j >= row + 1) {
                    System.out.print(n++ +" ");
                    }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();

        }

    }
}

