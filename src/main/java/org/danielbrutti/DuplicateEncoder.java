package org.danielbrutti;

/**
 * Hello world!
 */
public final class DuplicateEncoder {
    private DuplicateEncoder() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Duplicate Encoder ('din') => " + duplicateEncoder("din"));
        System.out.println("Duplicate Encoder ('recede') => " + duplicateEncoder("recede"));
        System.out.println("Duplicate Encoder ('Success') => " + duplicateEncoder("Success"));
        System.out.println("Duplicate Encoder ('(( @') => " + duplicateEncoder("(( @"));
        System.out.println("Duplicate Encoder ('   ()(   ')=> " + duplicateEncoder("   ()(   "));
        System.out.println("Duplicate Encoder ('Prespecialized') => " + duplicateEncoder("Prespecialized"));
    }

    public static String duplicateEncoder(String word) {
        // StringBuilder is prefered over StringBuffer since
        // we dont need to be thread safe and is faster
        StringBuilder builder = new StringBuilder();
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            // If this characater is present before of after the actual position
            // then it is repeated
            char c = word.charAt(i);
            builder.append(word.indexOf(c) == word.lastIndexOf(c) ? "(" : ")");
        }
        return builder.toString();
    }
}
