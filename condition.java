import java.util.Scanner;
public class condition{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number i will tell the day of the week");
        int day=sc.nextInt();
        
/* we can write the same code using the if else statement but here we use switch case statement
 because it is more readable and easy to understand */

        switch(day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("invalid day number");
            
        }
    }
}