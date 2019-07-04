package org.danielbrutti;

/**
 * Hello world!
 */
public final class BitCounting {
    private BitCounting() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("BitCount(0) = " + bitCount(0));
        System.out.println("BitCount(8) = " + bitCount(8));
        System.out.println("BitCount(12) = " + bitCount(12));
        System.out.println("BitCount(1234) = " + bitCount(1234));
    }

    public static int bitCount(int n){
        int count = 0;
        while (n > 0){
            n &= n-1;
            count++;
        }
        return count;
    }

}
