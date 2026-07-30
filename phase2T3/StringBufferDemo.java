public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        sb.insert(4, " Language");
        System.out.println("After Insert: " + sb);

        sb.delete(4, 13);
        System.out.println("After Delete: " + sb);

        sb.replace(5, 16, "Coding");
        System.out.println("After Replace: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);

        System.out.println("\nStringBuffer is thread-safe.");
        System.out.println("StringBuilder is faster but not thread-safe.");
    }
}