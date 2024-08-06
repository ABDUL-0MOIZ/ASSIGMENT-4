public class GretestPont{
public static void main(String[] args) {
int n0=gretestpoint(12,0);
    System.out.println(n0);
}
    public static int gretestpoint(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gretestpoint(y,x % y);
    }

}