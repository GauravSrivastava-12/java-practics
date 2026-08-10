import java.util.Scanner;
public class conditional{
    public static void main(String[]args){
        //write a program to print the value if it is even and divisible by 3 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("even number");
        }
    }
}