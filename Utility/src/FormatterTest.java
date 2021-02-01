import java.util.*;

public class FormatterTest {
	public static void main(String[] args)	{
		StringBuffer sb = new StringBuffer();
		Formatter formatter = new Formatter(sb);
		Calendar c = Calendar.getInstance();
	
		int i = 10;
		int j = 20;
		int k = i+j;
		String str = "���� ���";
		
		formatter.format("%s%n", str);
		formatter.format("%d�� %d�� ���ϸ� %d�� �ȴ� %n",i,j,k);
		formatter.format("���� �ð��� %tk�� %tM�� %tS�� �Դϴ�. %n",c,c,c);
		System.out.println(formatter.toString());
	}
}
