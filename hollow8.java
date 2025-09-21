/*wap to print hollow sand glass pattern
 *  # # # # #
 *    #   #
 *      #
 *    #   #
 *  # # # # # */
import java.util.Scanner;
public class hollow8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=row;
        int space=0;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(i==1||i==row||k==1||k==star)
                System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
            if(i<row/2+1){
                star-=2;
                space++;
            }
            else {
                star+=2;
                space--;
            }
        }
    }
}
