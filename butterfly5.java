/*wap to print butterfly pattern
 *#          *
 *#        * *
 *#      * * *
 *#    * * * *
 *#  * * * * *
 *#    * * * *
 *#      * * *
 *#        * *
 *#          *
 * */
import java.util.Scanner;
public class butterfly5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        if(row%2==0){
            row=row+1;
        }
        int star=1;
        int space=row/2;
        for (int i=1;i<=row;i++){
            for (int k=1;k<=space;k++){

                System.out.print(" "+" ");

            }
            for(int l=1;l<=star;l++){

                System.out.print("*"+" ");

            }
            System.out.println();
            if(i<=row/2){
                star++;
                space--;
            }
            else {
                star--;
                space++;
            }
        }
    }
}
