
public class binary {
    public static int minNonZeroProduct(int p) {
        long mod = 1000000007;
        long maxVal = (1L << p) - 1;
        // 2^p - 1
        long result = maxVal % mod;
        long base = maxVal - 1;
        long exp = (1L << (p - 1)) - 1;
        // 2^(p-1) - 1
        result = (result * powerMod(base, exp, mod)) % mod;
        return (int) result;
    }

    private static long powerMod(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        long half = powerMod(base, exp / 2, mod);
        half = (half * half) % mod;
        if (exp % 2 != 0) {
            half = (half * base) % mod;
        }
        return half;
    }

    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;
        System.out.println(minNonZeroProduct(p1));
        System.out.println(minNonZeroProduct(p2));
        System.out.println(minNonZeroProduct(p3));
    }
}