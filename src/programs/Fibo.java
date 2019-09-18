package programs;

public class Fibo {
	
	public static void findfibo(int number)
	{
		int f1=0;
		int f2=1;
		int f3 = 0;
		System.out.println("Fibonacci series of "+number+" numbers:");
		
		System.out.print(f1+" "+f2);
		for(int i=2;i<number;i++)
		{
		f3=f1+f2;
		System.out.print(" "+f3);
		f1=f2;
		f2=f3;
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findfibo(10);

	}

}
