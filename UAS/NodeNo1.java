public class NodeNo1 {
    TransaksiRentalNo1 data;
    NodeNo1 prev;
    NodeNo1 next;

    public NodeNo1(TransaksiRentalNo1 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
