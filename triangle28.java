/*mirror right angle triangle
         A
       1 A
     1 A 1
   A 1 A 1
* */
import java.util.Scanner;
public class triangle28 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        int count=1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if (i + j >= row + 1) {
                    if(count%2==0){
                        System.out.print(1+" ");
                        count++;}
                    else {
                        System.out.print("A"+" ");
                        count++;
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

