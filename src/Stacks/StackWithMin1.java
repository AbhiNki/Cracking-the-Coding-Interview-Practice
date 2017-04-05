package Stacks;

import java.util.Stack;

public class StackWithMin1 extends Stack<NodeWithMin>{
	
	public void push(int value)
	{
		int newMin =Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
		
	}
	
	public int min()
	{
		if(this.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
			return peek().min;
	}
	
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMin1 stack1 = new StackWithMin1();
		stack1.push(100);
		stack1.push(10);
		stack1.push(19);
		stack1.push(124);
		//System.out.print(stack1.toString());
		System.out.println(stack1.min());

	}

}
