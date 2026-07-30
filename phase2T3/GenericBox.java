class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericBox {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java");

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(99.99);

        System.out.println("Integer Value: " + intBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());
        System.out.println("Double Value: " + doubleBox.getValue());
    }
}