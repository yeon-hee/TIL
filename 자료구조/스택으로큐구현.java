import java.util.Stack;

public class 스택으로큐구현 {

	Stack<Integer> inStack = new Stack<>();
	Stack<Integer> outStack = new Stack<>();

	public void enQueue(Integer item) {
		inStack.add(item);
	}
	
	public Object deQueue() {
		
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.add(inStack.pop());
			}
		}
		return outStack.pop();
	}
}
