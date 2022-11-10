package Task_8;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.add(4);
        doublyLinkedList.add(-2);
        doublyLinkedList.add(9);
        doublyLinkedList.add(1);
        doublyLinkedList.add(12);

        System.out.println("DoublyLinkedList: " + doublyLinkedList);
        System.out.println("Size: " + doublyLinkedList.size());

        doublyLinkedList.remove(4);
        doublyLinkedList.remove(9);
        doublyLinkedList.remove(12);

        System.out.println("DoublyLinkedList(With remove 4, 9, 12): " + doublyLinkedList);
        System.out.println("Size: " + doublyLinkedList.size());
    }
}
