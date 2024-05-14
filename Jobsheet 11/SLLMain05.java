import java.util.Scanner;

public class SLLMain05 {

    public static void main(String[] args) {
        LinkedList05 myLinkedList05 = new LinkedList05();
        myLinkedList05.print();
        myLinkedList05.addFirst(800);
        myLinkedList05.print();
        myLinkedList05.addFirst(700);
        myLinkedList05.print();
        myLinkedList05.addLast(500);
        myLinkedList05.print();
        myLinkedList05.insertAfter(700, 300);
        myLinkedList05.print();

        System.out.println("Data pada indekx ke-1 : " + myLinkedList05.gedData(1));
        System.out.println("Data 300 berada pada indeks ke:" + myLinkedList05.indexOf(300));

        myLinkedList05.remove(300);
        myLinkedList05.print();
        myLinkedList05.removeFirst();
        myLinkedList05.print();
        myLinkedList05.removeLast();
        myLinkedList05.print();
        myLinkedList05.removeAt(0);
        myLinkedList05.print();

    }
}
 