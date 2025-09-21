import java.util.Scanner;
public class pattern1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows  :");
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println('*');
        }
    }
}
