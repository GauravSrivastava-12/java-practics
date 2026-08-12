import java .util.Scanner;
public class Floop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=7;i<=n;i=i+1){
            System.out.println(i);
        }
    }
}