class Triangle
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextint();//no of rows
		int num=1;
		for( int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}
} 