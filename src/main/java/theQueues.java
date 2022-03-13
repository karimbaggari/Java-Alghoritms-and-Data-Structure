import java.util.LinkedList;
import java.util.Queue;

public class theQueues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("PHP");
        queue.add("Python");
        queue.add("Pascal");
        System.out.println("Tête: "+queue.peek());
        System.out.println(queue);

        queue.remove();
        //delete the head or return null if it's empty
        queue.poll();

        //Aprés la suppression
        System.out.println(queue);
    }
}
