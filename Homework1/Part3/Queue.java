public class Queue<E> {

	private Stack<E> queueTop;
	private Stack<E> queueBottom;
	
	public Queue() {
		this.queueTop = new Stack<E>();
		this.queueBottom = new Stack<E>();
	}
	
	public void enqueue(E object) {
		this.queueTop.push(object);
	}
	
	public E dequeue() {
		if(this.queueBottom.isEmpty()) {
			int size = this.queueTop.size();
			for(int i = 0; i < size; i++) {
				this.queueBottom.push(this.queueTop.pop());
			}
		}
		return this.queueBottom.pop();
	}
	
	public void init() {
		//idk what this method does
	}
}
