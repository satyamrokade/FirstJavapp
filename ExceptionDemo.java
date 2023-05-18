import java.util.Scanner;
// git changes
//latest changes
public class ExceptionDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter size of Array");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter numbers ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();		
		}
		
		System.out.println("Entered numbers are ");
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    
	    System.out.println("Enter index number ");
	    int i=sc.nextInt();
	    
	    System.out.println(a[i]);
	    
		}
		
		catch(NumberFormatException e)
		{
			e.getMessage();
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
			System.out.println(e);
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println(e);
		}
		
		String str="seeta";
		System.out.println(str);
	
	}
}
