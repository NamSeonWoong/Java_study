import java.util.ArrayList;

public class GenericsTest {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Hello");
		aList.add("Java");
		
		String Hello = aList.get(0);
		String Java = aList.get(1);
		System.out.println(Hello);
		System.out.println(Java);
	}

}
