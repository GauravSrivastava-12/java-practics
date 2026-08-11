import java.util.Scanner;
public class OR{
    public static void main(String[]args){
        //program the number in divisible by 3 or 5
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if (num%3==0||num%5==0){
            System.out.println("divisible by 3 or 5");
        }
         else{
                System.out.println("not divisible by any of these");
            }

    }
}