import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String args[])	{
		Vector list = new Vector(5);
		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("�ڹ�"));
		System.out.println("<<Vector�� ����� ��ҵ�>>");
		for (int i=0; i <list.size();i++)	{
			System.out.println("����Ʈ��"+i+ "��° ��� :" +list.elementAt(i));
		}
		Enumeration e = list.elements();
		System.out.println();
		System.out.println("Enumerations ��ҵ�");
		while (e.hasMoreElements()) {
			System.out.println("e�� ��� :"+e.nextElement());
		}
	}	
}
