public class ArrayExceptionDemo {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid Array Index.");
        }
    }
}