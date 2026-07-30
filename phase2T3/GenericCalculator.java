class DataStore<T> {
    private T value;

    public DataStore(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Stored Value: " + value);
    }
}

public class GenericCalculator {
    public static void main(String[] args) {

        DataStore<Integer> intObj = new DataStore<>(100);
        DataStore<String> strObj = new DataStore<>("Java");
        DataStore<Double> doubleObj = new DataStore<>(99.99);

        intObj.display();
        strObj.display();
        doubleObj.display();
    }
}