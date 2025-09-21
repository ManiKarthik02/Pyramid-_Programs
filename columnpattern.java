import java.util.Scanner;
public class columnpattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of columns :");
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print("* ");
        }
    }
}
