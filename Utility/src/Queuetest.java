import java.util.LinkedList;
import java.util.Queue;

public class Queuetest {

	public static void main(String[] args) {
			Queue<String> queue = new LinkedList<String>();
			for(int i=1; i<=3;i++)	{
				queue.add("������-"+i);
			}
			System.out.println("���� ��");
			System.out.println(queue.peek());
			System.out.println("������");
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			
		}
	}


