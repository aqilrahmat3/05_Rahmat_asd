public class Node05 {

    int data;
    Node05 prev, next;

    Node05(Node05 prev, int data, Node05 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}