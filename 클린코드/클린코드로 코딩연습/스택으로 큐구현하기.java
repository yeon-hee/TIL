import java.util.Stack;

public class Queue {
	
	Stack<Integer> inStack = new Stack<>();
	Stack<Integer> outStack = new Stack<>();
	
	public void enQueue(int item) {
		inStack.add(item);
	}
	
	public int deQueue() {
		
		if(outStack.isEmpty()) {
			if(inStack.isEmpty()) return -1;
			while(!inStack.isEmpty()) {
				outStack.add(inStack.pop());
			}
		}
		return outStack.pop();
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.deQueue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		System.out.println(queue.deQueue());
	}
}
