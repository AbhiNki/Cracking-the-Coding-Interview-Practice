package Stacks;

import java.util.Stack;

public class StackSort {
	public Stack<Integer> sort(Stack<Integer> stack1)
	{
		Stack<Integer> stack2 =new Stack<Integer>();
		
		while(!stack1.isEmpty())
		{
			int tmp = stack1.pop();
			while(!stack2.isEmpty() && stack2.peek() > tmp)
			{
				stack1.push(stack2.pop());
			}
			stack2.push(tmp);
			
		}
		
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		return stack1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StackSort s = new StackSort();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(6);
		stack.push(3);
		stack.push(8);
		stack.push(1);
		
		Stack<Integer> sortedStack = s.sort(stack);
		System.out.println("top ele:"+sortedStack.peek());
		
		for(Integer i: sortedStack)
		{
			System.out.println("|"+i+"|");
			System.out.println("__");
		}
		

	}

}
