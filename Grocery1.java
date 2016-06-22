import java.io.*;
import java.util.*;
class Grocery1
{
	String item;
	int weight;

	public Grocery1()
	{
		
		weight=10;
		
		item="Sugar";
		
		
	}

	public void addweight()
	{
		
		weight+=5;
		
		
	}

	public void removeweight()
	{
		
		
		weight-=1;
		
		
	}

	public void showweight()
	{
		System.out.println(weight);
	}

	public static void main(String args[])
	{
		Grocery1 a= new Grocery1();
		System.out.print("Current Weight="); 
		a.showweight();
	
		System.out.print("Weight after adding =");
		a.addweight(); 
		a.showweight();

		System.out.print("Weight after subtracting="); 
		a.removeweight();
		a.showweight();
	}
}
		
		
	