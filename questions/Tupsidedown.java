import java.util.Scanner;
public class Tupsidedown{
    public static void main(String[]args){
         
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number of row:");
        //  int r=sc.nextInt();
        System.out.print("Enter number of column:");
        int c=sc.nextInt();

 for (int i = 1; i <= c; i++) {
    for (int j = 1; j <= c - i + 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}

    }}

   