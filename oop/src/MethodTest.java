
public class MethodTest {
	int a;
	
	public void vartest()	{
		this.a++;
	}
	
	public static void main(String[] args) {
		MethodTest myTest = new MethodTest();
		myTest.a=1;
		myTest.vartest();
		System.out.println(myTest.a);
		

	}

}
