public class Myfactorial 
{
	pubic static void main( string args[])
	{
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		Sytem.out.println(factorial(n));
	}
	public static long factorial( long num)
	{
		if(num<=1)
			return 1;
		else 
			return num*factorial(num-1);
	}
}