/*wap to print the reverse pyramid pattern
 * 1 0 1 0 1
    1 0 1
      1
 * */
import java.util.Scanner;
public class pyramid24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row= sc.nextInt();
        int star=row*2-1;
        int space=0;
        for(int i=1;i<=row;i++){
            int a=1;
            for(int j=1;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++) {
                if (k%2 == 0) {
                    System.out.print(a-- + " ");
                    if(a==-1){
                        a=1;
                    }

                } else {
                    System.out.print(a--+ " ");
                    if(a==-1){
                        a=1;
                    }

                }
            }
            space++;
            star=star-2;
            System.out.println();
        }

    }
}
