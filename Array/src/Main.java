
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[10000];
		for(int i=0;i<10000; i++)	{
			arr[i]=(int)(Math.random()*100+1);
		}
		int sum =0;
		for(int i=0;i<10000;i++) {
			sum+= arr[i];
		}
		System.out.println(sum/10000);
	}

}