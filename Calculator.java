public class Calculator
{
	Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{
		
		System.out.println("CALCULATOR");
		System.out.println("1:Addition");
		System.out.println("2:Subtraction");
		int n=in.nextInt();
		if(n==1)
		{
			addition();
		}
		if(n==2)
		{
			subtraction();
		}
	}
	public static int addition()
	{
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}
	public static int subtraction()
	{
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		int diff=a-b;
		System.out.println(diff);
	}
}
	
		
		