public class DoubleLinkedList {
    private TransaksiRental head;
    private TransaksiRental tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(TransaksiRental data) {
        if (head == null) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
    }

    public void printList() {
        TransaksiRental current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void sortByNoTNKB() {
        if (head == null || head == tail) {
            return; // Tidak perlu diurutkan jika kosong atau hanya satu node
        }

        boolean swapped;
        TransaksiRental temp;

        do {
            swapped = false;
            TransaksiRental current = head;

            while (current.next != null) {
                if (current.getBarangRental().getNoTNKB().compareTo(current.next.getBarangRental().getNoTNKB()) > 0) {
                    temp = current;
                    current = current.next;
                    
                    // Swap nodes
                    if (temp.prev != null) {
                        temp.prev.next = current;
                    }
                    if (current.next != null) {
                        current.next.prev = temp;
                    }
                    temp.next = current.next;
                    current.prev = temp.prev;
                    current.next = temp;
                    temp.prev = current;

                    // Update head and tail if necessary
                    if (head == temp) {
                        head = current;
                    }
                    if (tail == current) {
                        tail = temp;
                    }

                    swapped = true;
                } else {
                    current = current.next;
                }
            }
        } while (swapped);
    }
}
