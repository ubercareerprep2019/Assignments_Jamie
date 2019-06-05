import java.util.ArrayList;
import java.util.List;

public class Queue<E> {

	//using an array???
	private List<E> queue;
	
	public Queue() {
		this.queue = new ArrayList<E>();
	}
	
	public void enqueue(E object) {
		this.queue.add(object);
	}
	
	public E dequeue() {
		return this.queue.remove(0);
	}
	
	public void init() {
		//idk what this method does
	}
	
	public E top() {
		return this.queue.get(0);
	}
}
