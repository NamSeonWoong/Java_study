import java.util.Stack;

public class StackTest {
	public static void main(String[] args)	{
		Stack stack = new Stack();
		for(int i=1; i<5;i++)	{
			stack.push("µ¥ÀÌÅÍ-"+i);
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
