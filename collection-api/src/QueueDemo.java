import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.add("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek());
		
		while(!que.isEmpty())
			System.out.println(que.poll());
	}
}
