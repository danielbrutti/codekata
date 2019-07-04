package org.danielbrutti;

/**
 * Hello world!
 */
public final class SumOfParts {
    private SumOfParts() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length+1];
        for(int i = ls.length-1; i >= 0; i--) {
            result[i] = result[i+1]+ls[i];
        }
        return result;
    }

}
