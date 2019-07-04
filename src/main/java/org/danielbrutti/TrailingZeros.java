package org.danielbrutti;

/**
 * Hello world!
 */
public final class TrailingZeros {
    private TrailingZeros() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Trailing zeros(1): " + trailingZeros(1L));
        System.out.println("Trailing zeros(4): " + trailingZeros(4L));
        System.out.println("Trailing zeros(6): " + trailingZeros(6L));
        System.out.println("Trailing zeros(12): " + trailingZeros(12L));
        System.out.println("Trailing zeros(100): " + trailingZeros(100L));
        System.out.println("Trailing zeros(1000): " + trailingZeros(1000L));
        System.out.println("Trailing zeros(1000000): " + trailingZeros(1000000L));
        System.out.println("Trailing zeros(1000000000): " + trailingZeros(1000000000L));
    }

    public static long trailingZeros(long n) {
        if (n <= 4) return 0;
        
        long zeros = 0;
        long kmax = kmax(n);
        for (int k = 1; k <= kmax; k++){
            zeros += Math.floor(n/Math.pow(5, k));
        }
        return zeros;
    }

    /**
     * Kmax is equal to floor of Log(5,n).
     * Log(5,n) = Log(10,n)/Log(10,5)
     * @param n
     * @return
     */
    private static long kmax(long n) {
        return (long)Math.floor(Math.log(n)/Math.log(5));
    }
}
