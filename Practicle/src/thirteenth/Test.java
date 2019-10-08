package thirteenth;
public class Test extends StaticStack 
{
	public static void main(String[] args) 
	{
		StaticStack S1 = new StaticStack();
		DynamicStack S2 = new DynamicStack();
		S1.push(20);
		S1.push(22);
		S1.pop();
		S1.show();
		S2.push(34);
		S2.push(35);
		S2.pop();
		S2.show();
	}	
}