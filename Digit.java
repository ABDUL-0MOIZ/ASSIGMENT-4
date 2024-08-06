public class Digit {
    public static void main(String[] args) {

;

        System.out.println(  digit(220,2));
    }

    private static int digit(int i, int j) {

        int chek=i%10;


         if (i==0){
             return 0;
         }
        else {
             i = i / 10;
             return ( (chek == j) ? 1 : 0) + digit(i, j);
         }
        }



}