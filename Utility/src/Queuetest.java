import java.util.LinkedList;
import java.util.Queue;

public class Queuetest {

	public static void main(String[] args) {
			Queue<String> queue = new LinkedList<String>();
			for(int i=1; i<=3;i++)	{
				queue.add("더이터-"+i);
			}
			System.out.println("가장 앞");
			System.out.println(queue.peek());
			System.out.println("꺼내기");
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			
		}
	}


