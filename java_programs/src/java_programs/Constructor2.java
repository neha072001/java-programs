package java_programs;

public class Constructor2 {
	private String name;
	private int balance;
	private int min_bal=1000;
	
	public Constructor2()
	{
		name="XYZ";
		balance=900;
	}
	public Constructor2 (String k,int b)
	{
		name=k;
		balance=b;
	}
	public void display()
	{
		System.out.println(name+" "+balance);
	}
}

}
