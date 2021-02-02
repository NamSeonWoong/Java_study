import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String args[])	{
		Vector list = new Vector(5);
		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("자바"));
		System.out.println("<<Vector에 저장된 요소들>>");
		for (int i=0; i <list.size();i++)	{
			System.out.println("리스트의"+i+ "번째 요소 :" +list.elementAt(i));
		}
		Enumeration e = list.elements();
		System.out.println();
		System.out.println("Enumerations 요소돌");
		while (e.hasMoreElements()) {
			System.out.println("e의 요소 :"+e.nextElement());
		}
	}	
}
