import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> num = new ArrayList<String>();
		num.add("one");
		num.add("two");
		
		for(String nums:num)	{
			System.out.println(nums);
		}
	}

}
