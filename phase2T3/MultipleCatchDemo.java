public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;              // ArithmeticException

            int num = Integer.parseInt("ABC"); // NumberFormatException

            String str = null;
            System.out.println(str.length());  // NullPointerException

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);        // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}