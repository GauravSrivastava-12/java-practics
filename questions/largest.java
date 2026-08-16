import java.util.Scanner;
public class largest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a :");
        int a=sc.nextInt();
        System.out.print("enter b :");
        int b=sc.nextInt();
        System.out.print("enter c : ");
        int c=sc.nextInt();



        // int a,b,c;
        // a=1;
        // b=2;
        // c=3;
        if(b>a && b>c){
            System.out.println("b is largest");
            }
        else if(c>a && c>b){
            System.out.println("c is largest");
        }
        else{
            System.out.println("a is largest");
            }
    }
}