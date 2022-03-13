import java.util.Iterator;
import java.util.LinkedList;

public class theLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("Negan");

        //Adding an element to the last position
        list.addLast("Rick");

        //Adding an element to the 3rd position
        list.add(2, "Glenn");
        //System.out.println(list);

       Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
           System.out.println(iterator.next());
        }

        //removing 2nd element, index starts with 0
        // we are not actually deleting the element where just changing in the next and previous pointers in the linked List
        list.remove(1);

        System.out.println("\nAfter removing second element: ");
        //Iterating LinkedList again
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }
    }
}
