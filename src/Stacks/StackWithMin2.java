package Stacks;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer> {
	
	Stack<Integer> s2;
	public StackWithMin2()
	{
		this.s2 = new Stack<Integer>();
	}
	
	public void push(int value)
	{
		if(value<=min())
		{
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop()
	{
		int value = super.pop();
		if(value == min())
		{
			s2.pop();
		}
		return value;
	}
	
	public int min()
	{
		if(s2.empty())
			return Integer.MAX_VALUE;
		else
			return s2.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackWithMin2 stack2 = new StackWithMin2();
		stack2.push(20);
		stack2.push(-30);
		stack2.push(-40);
		System.out.println(stack2.min());

	}

}
