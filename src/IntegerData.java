public class IntegerData implements Comparable {
    private final int data;

    public IntegerData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public String toString() {
        return Integer.toString(this.data);
    }

    @Override
    public int compareTo(Object integerData) {
        IntegerData compareData = (IntegerData) integerData;
        if (this.data < compareData.getData()) {
            return -1;
        } else if (this.data > compareData.getData()) {
            return 1;
        } else {
            return 0;
        }
    }
}
