import java.util.*;

public class FormatterTest {
	public static void main(String[] args)	{
		StringBuffer sb = new StringBuffer();
		Formatter formatter = new Formatter(sb);
		Calendar c = Calendar.getInstance();
	
		int i = 10;
		int j = 20;
		int k = i+j;
		String str = "연산 결과";
		
		formatter.format("%s%n", str);
		formatter.format("%d과 %d를 더하면 %d가 된다 %n",i,j,k);
		formatter.format("현재 시간은 %tk시 %tM분 %tS초 입니다. %n",c,c,c);
		System.out.println(formatter.toString());
	}
}
