package thirteenth;
public class StaticStack extends Stackk 
{
		int top = -1;
		int[] arr = new int[4];
		
		boolean push(int num)
		{
			if(top==3)
			{
				return false;
			}
			else
			{
				top++;
				arr[top] = num;
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
				top--;
				return true;
			}
		}
		void show()
		{
			if(top!=-1)
			{
			System.out.println(arr[top]);
			}
			else
			{
				System.out.println("nothing to show");
			}
		}
	}