package thirteenth;
import java.util.*;

public class DynamicStack extends Stackk
{
	int top = -1;
	ArrayList <Integer> arrli = new ArrayList<Integer>(4);
	boolean push(int num)
	{
		if(top == 3)
		{
			return false;
		}
		else
		{
			top++;
			arrli.add(num);
			return true;
		}
	}
	boolean pop()
	{
		if(top == -1)
		{
			return false;
		}
		else
		{
			arrli.remove(top);
			top--;
			return true;
		}
	}
	void show()
	{
		if(!arrli.isEmpty())
		{
			System.out.println(arrli.get(top));
		}
		else
		{
			System.out.println("nothing to show");
		}
	}
}
