/*wap to print reversed right angled triangle
 *5 e 5 e 5
 *4 d 4 d
 *3 c 3
 *2 b
 *1
 * */
import java.util.Scanner;
public class triangle33 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        int n=row;
        char ch=(char) ('a'+(row-1));
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if(i+j<=row+1){
                    if(j%2==0){
                    System.out.print(ch+" ");
                    }
                    else{
                        System.out.print(n+" ");
                    }}
                else {
                    System.out.print(" "+" " );
                }
            }
            System.out.println();
            ch--;
            n--;
        }

    }
}

