public class Node<T> {
    private Node<T> next = null;
    private final T value;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getNext() {return this.next;}
    public void setNext(Node<T> reference) {this.next = reference;}
}
