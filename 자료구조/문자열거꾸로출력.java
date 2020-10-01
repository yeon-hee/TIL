import java.util.Stack;

public class 문자열거꾸로출력 {

	public static void main(String[] args) {
		String str = "hello";
	}
	
	static void printReverse(String array) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int index=0;index<array.length();index++) {
			stack.add(array.charAt(index));
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	 
}
