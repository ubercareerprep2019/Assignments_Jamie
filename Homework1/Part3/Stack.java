import java.util.ArrayList;
import java.util.List;

public class Stack<E> {

	private List<E> stack;
	
	public Stack() {
		this.stack = new ArrayList<E>();
	}
	
	public void push(E object) {
		this.stack.add(0, object);
	}
	
	public E pop() {
		if(this.stack.size() == 0) {
			return null;
		}
		return this.stack.remove(0);
	}
	
	public E top() {
		if(this.stack.size()==0) {
			return null;
		}
		return this.stack.get(0);
	}
	
	public boolean isEmpty() {
		return this.stack.size()==0;
	}
	
	public int size() {
		return this.stack.size();
	}
	
	public E min() {//???
		return null;
	}
}
