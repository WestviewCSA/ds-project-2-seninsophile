import java.util.*;

public class Stack<J> {	
	
	// data
	private ArrayList<J> data;
	
	// add a constructor
	
	public Stack(){
		// init private instance var
		data = new ArrayList<J>();
		
	}
	
	
	// add the element to the Stack
	public void push(J el) {
		data.add(el);
	}
	
	
	public J pop() {
		if(data.size()==0) {
			return null;
		} else {
			return data.remove(data.size()-1);
		}
	}
	
	// return size of the stack
	public int size() {
		return data.size();
	}
	
	public boolean empty() {
		return (data.size() == 0);
	}
	
	public J peek() {
		if(data.size()==0) {
			return null;
		} else {
			return data.get(data.size()-1);
		}
	}
	
	// ArrayLit toString
	public String toString() {
		return data.toString();
	}
	
}
