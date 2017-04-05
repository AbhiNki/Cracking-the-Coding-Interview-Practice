package Stacks;

import java.util.Stack;

public class QueueWithStacks {
	Stack<Integer> newestStack;
	Stack<Integer> oldestStack;
	
	public QueueWithStacks()
	{
		newestStack = new Stack<Integer>();
		oldestStack = new Stack<Integer>();
	}
	public int size()
	{
		return newestStack.size()+oldestStack.size();
	}
	
	public void add(int value)
	{
		newestStack.push(value);
	}
	
	public void shiftStack()
	{
		if(oldestStack.isEmpty())
		{
			while(!newestStack.isEmpty())
			{
				oldestStack.push(newestStack.pop());
			}
		}
	}
	
	public Integer peek()
	{
		shiftStack();
		return oldestStack.peek();
	}
	
	public Integer remove()
	{
		shiftStack();
		return oldestStack.pop();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueWithStacks queue1 = new QueueWithStacks();
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		queue1.add(6);
		queue1.add(7);
		
		System.out.println(queue1.remove());

	}

}
