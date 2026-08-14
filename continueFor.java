public class continueFor{
    public static void main(String[]args){
        for(int i=1;i<=10;i++){
            if(i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
// here the 7 will not be print due too continue it skips the itration i==7 .