public class binaryTreeArrayMain05 {
    public static void main(String[] args) {
        binaryTreeArray05 bta = new binaryTreeArray05();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println("PreOrder Traversal: ");
        bta.traversePreOrder();
        System.out.println();
        System.out.println("PostOrder Traversal: ");
        bta.traversePostOrder();
    }
}