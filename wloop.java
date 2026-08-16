public class wloop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 2) {
            int j = 1;

            while (j <= 3) {
                System.out.print("i=" + i + " j=" + j + "   ");
                j++;
            }

            System.out.print();
            i++;
        }
    }
}