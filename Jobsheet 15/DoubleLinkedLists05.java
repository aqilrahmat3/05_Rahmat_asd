public class DoubleLinkedLists05 {

    Node05 head;
    int size;
    private Node05 newNode05;

    public DoubleLinkedLists05() {
        head = null;
        size = 0;
    }

        public boolean isEmpty() {
            return head == null;
        }

        public void addFirst (int item, int jarak) {
            if (isEmpty()) {
                head = new Node05(null, item, jarak,  null);
            } else {
                Node05 newNode05 = new Node05(null, item, jarak, head);
                head.prev = newNode05;
                head = newNode05;
            }
            size++;
        }

            public int getJarak(int index) throws Exception {
                if (isEmpty() || index >= size) {
                    throw new Exception("Nilai indeks diluar batas.");
                }
                Node05 tmp = head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.jarak;
            }

            public void remove(int index) {
                Node05 current = head;
                while (current != null) {
                    if (current.data == index) {
                        if (current.prev != null) {
                            current.prev.next = current.next;
                        }else {
                            head = current.next;
                        }
                        if (current.next != null) {
                            current.next.prev = current.prev;
                        }
                        size--;
                        break;
                    }
                    current = current.next;
                }
            }

            public int size() {
                return size;
            }

            public int get(int index) throws Exception {
                if (isEmpty() || index >= size) {
                    throw new Exception("Nilai indeks di luar batas.");
                }
                Node05 tmp = head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.data;
                }

            public void clear() {
                head = null;
                size = 0;
            }
        }