package com.cci.solutions;

import java.util.HashSet;


public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}
	public void insertAtHead(Integer data)
	{
		Node newNode =new Node(data);
		newNode.setNextNode(this.head);
		this.head=newNode;
	}
	public void deleteDups()
	{
		Node n = this.head;
		HashSet<Integer> set =new HashSet<Integer>();
		Node previous =null;
		while(n!=null)
		{
			if(set.contains(n.getData()))
			{
				previous.setNextNode(n.getNextNode());
			}
			else
			{
				set.add(n.getData());
				previous =n;
			}
			n=n.getNextNode();	
		}
		
	}
	
	public void deleteDupsWithNoBuffer()
	{
		Node current= head;
		while(current!=null)
		{
			Node runner = current;
			while(runner.nextNode != null)
			{
				if(runner.nextNode.data==current.getData())
					runner.nextNode= runner.nextNode.nextNode;
				else
					runner=runner.nextNode;
			}
			current = current.nextNode;
		}
		
	}
	public String toString()
    {
    	String result="[";
    	Node current=this.head;
    	while(current !=null)
    	{
    		result+=current.toString()+",";
    		current = current.getNextNode();
    	}
    	result +="]";
    	return result;
    }
}
