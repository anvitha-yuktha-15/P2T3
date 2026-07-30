public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

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
    }
}