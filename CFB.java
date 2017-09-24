class FunctionDemo
{
	public static void main(String argv[])
	{
		printCFB(4);
	}
}
public static void printCFB(int num)
{
	for(int x=1;x<=num;x++)
	{
		for(int y=1;y<=x;y++)
		{
			System.out.println(x*y);
		}
	}
}
