/*wap to print sand glass pattern
 *A 1 A 1 A
 *  1 A 1
 *    A
 *  1 A 1
 *A 1 A 1 A   */
import java.util.Scanner;
public class sandglass7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row= sc.nextInt();
        int star=row;
        int space=0;
        int b=1;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=star;k++){
                if(b%2==0){
                    System.out.print(1 +" ");
                    b++;
                }
                else {
                    System.out.print("A" +" ");
                    b++;
                }
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
