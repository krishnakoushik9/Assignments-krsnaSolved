package krsnaSolved;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;
    public DynamicArray() {
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray.capacity);
    }
}
