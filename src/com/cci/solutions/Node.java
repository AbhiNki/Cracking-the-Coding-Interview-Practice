package com.cci.solutions;

public class Node {
	 Node nextNode;
	 Integer data;
	
	public Node(Integer data)
	{
		this.data =data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Integer getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	

}
