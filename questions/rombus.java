import java.util.Scanner;

public class rombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of column: ");
        int c = sc.nextInt();

        for (int i = 1; i <= c; i++) {

            // spaces
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }

            // next row
            System.out.println();
        }
    }
}