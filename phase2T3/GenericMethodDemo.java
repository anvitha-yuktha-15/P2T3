public class GenericMethodDemo {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40};
        String[] names = {"Java", "Python", "C++"};
        Character[] letters = {'A', 'B', 'C', 'D'};

        System.out.println("Integer Array:");
        printArray(numbers);

        System.out.println("String Array:");
        printArray(names);

        System.out.println("Character Array:");
        printArray(letters);
    }
}