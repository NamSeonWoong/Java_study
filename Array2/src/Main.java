
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=50;
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0;j<N; j++) {
				arr[i][j] =(int)(Math.random()*10);
			}
		}
		for(int i =0;i<N;i++) {
			for(int j=0;j<50;j++)	{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
