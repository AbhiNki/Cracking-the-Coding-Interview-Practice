package com.cci.solutions;



public class LinkedListOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list =new LinkedList();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(15);
		list.insertAtHead(20);
		list.insertAtHead(7);
		list.insertAtHead(14);
		list.insertAtHead(13);
		list.insertAtHead(2);
		list.insertAtHead(2);
		list.insertAtHead(2);
		list.insertAtHead(13);
		//System.out.println(list);
		//System.out.println(list.length());
		//list.deleteFromHead();
		System.out.println(list);
		list.deleteDupsWithNoBuffer();
		System.out.println(list);
	}

}
