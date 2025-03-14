import java.util.*;

public class Queue<T> {
	
	private Stack<T> stackA;
	private Stack<T> stackB;

	//constructor
	public Queue() {
		
		stackA = new Stack<T>();
		stackB = new Stack<T>();
		
	}
	
	/*
	 * Add to the queue
	 */
	public void enqueue(T el) {
		stackA.push(el);
	}
	
	/* 
	 * Remove from the queue 
	 * Return null if empty
     */
	public T dequeue() {
		if(stackA.empty()) {
			return null;
		} else {
			for(int i = stackA.size(); i > 1; i--) {
				stackB.push(stackA.pop());
			}
			T pop = stackA.pop();
			for(int i = stackB.size(); i > 0; i--) {
				stackA.push(stackB.pop());
			}
			return pop;
		}
	} 
	
	// return next element in the queue, do not remove
	public T peek() {
		return stackA.peek();
	}
	
	public int size() {
		return stackA.size();
	}
	
	public String toString() {
		String res = "[";
		for(int i = stackA.size(); i > 0; i--) {
			stackB.push(stackA.pop());
		}
		while(stackB.size() > 1) {
			stackA.push(stackB.peek());
			res += stackB.pop() + ", ";
		}
		stackA.push(stackB.peek());
		res += stackB.pop() + "]";
		return res;
	}
	
	public boolean empty() {
		return stackA.empty();
	}
}
