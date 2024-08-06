public class Handshake {
    public static void main(String[] args) {
       int res= handshake(4);
        System.out.println(res);
    }

    private static int handshake(int i) {
        if(i<=1) {
            return 0;
        } else if (i==2) {
            return 1;
        }
        return handshake(i-1)+(i-1);

    }
}