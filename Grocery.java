import java.io.*;
import java.util.*;
import java.text.*;
class Grocery
{
	String item;
	int weight;

	public Grocery()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter item weight:");
		weight=in.nextInt();
		System.out.println("Enter item name:");
		in.nextLine();
		item=in.nextLine();
		in.close();
		
	}

	public void addweight()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight to be added:");
		int a=sc.nextInt();
		weight+=a;
		sc.close();
		
	}

	public void removeweight()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter weight to be subtracted:");
		
		int s=in.nextInt();
		weight-=s;
		in.close();
		
	}

	public void showweight()
	{
		System.out.println(weight);
	}

	public static void main(String args[])
	{
		Grocery a= new Grocery();
		System.out.print("Current Weight="); 
		a.showweight();
	
	
		a.addweight(); 
		a.showweight();

		
		a.removeweight();
		a.showweight();
	}
}
		
		
	