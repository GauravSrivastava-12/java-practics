import java.util.Scanner;
public class sumofN{
    public static void main(String[]args){
       int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Nnumber : ");
        int N=sc.nextInt();
        
         for(int i=1;i<=N;i++){
            total=total+i;
         }
System.out.println("Sum ="+ total);



    }
}