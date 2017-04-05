package LinkedLists;

import java.util.HashSet;
import java.util.Stack;

public class LinkedList {
    Node head;
    
	
	public void insertAtHead(int data)
	{
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}
	public void apeendAtTail(int data)
	{
		Node end = new Node(data);
		Node current = this.head;
		while(current.next !=null)
		{
			current = current.next;
		}
		current.next = end;
				
	}
	
	public void deleteNode(int data)
	{
		Node current  = this.head;
		
		if(current.data == data)
		{
			head = head.next;
		}
		while(current.next != null)
		{
			if(current.next.data == data)
			{
				current.next = current.next.next;
			}
			current=current.next;
		}
	}
	
	
	public void removeDups()
	{
		Node previous = null;
		HashSet<Integer> set = new HashSet<Integer>();
		Node current = this.head;
		
		while(current.next!=null)
		{
			if(set.contains(current.data))
			{
				previous.next = current.next;
			}
			else
			{
				set.add(current.data);
				previous = current;
			}
			current = current.next;
		}
		
		for(Integer i : set)
		{
			System.out.print(i+" ");
		}
		
	}
	
    public void removeDupsWithoutBuffer()
    {
    	Node current = this.head;
    	while(current!= null)
    	{
    		Node runner = current;
    		while(runner.next!= null)
    		{
    			if(current.data == runner.next.data)
    			{
    				runner.next = runner.next.next;
    			}
    			else
    				runner = runner.next;
    		}
    		current = current.next;
    	}
    }
    
    public void returnKthToLast(int k) //working
    {
    	Node current = this.head;
    	int counter=0;
    	int kthIndex = k;
    	while(current != null)
    	{
    		if(counter >= kthIndex)
    		{
    			System.out.print(current.data+" ");
    		}
    		current = current.next;
    		counter++;
    	}
    	
    }
    
    public int returnKth2LastRecursive(Node head, int k) //not working
    {
    	
    	if(head == null)
    		return 0;
    	int index = returnKth2LastRecursive(head.next, k)+1;
    	if(index == k)
    	{
    		System.out.println(k +"th to last node is "+ head.data);
    	}
    	return index;
    }
	
    public void deleteFromMiddle(Node n)
    {
    	Node next = n.next;
    	n.data = next.data;
    	n.next = next.next;
    	
    }
    
    public void partition(int k)
    {
    	Node head = this.head;
    	Node tail = this.head;
    	Node current = this.head;
    	
    	while(current !=null)
    	{
    		Node next = current.next;
    		if(current.data < k)
    		{
    			//add at head
    			//System.out.println("Adding at head: "+current.data);
    			current.next = head;
    			head = current;
    		}
    		else
    		{
    			//add at tail
    			//System.out.println("Adding at tail: "+current.data);
    			tail.next = current;
    			tail = current;
    			
    		}
    		current = next;
    	}
    	tail.next = null;
    	
    	
    	while(head != null)
    	{
    		System.out.print(head.data+" ");
    		head = head.next;
    	}
    	
    	
    }
    
    public static Node sumOf2LLists(Node list1, Node list2, int carry)
    {
    	if(list1==null && list2 == null && carry == 0)
    	{
    		return null;
    	}
    	
    	Node result = new Node();
    	int value = carry;
    	
    	if(list1!=null)
    		value+=list1.data;
    	if(list2!=null)
    		value+=list2.data;
    	
    	result.data= value % 10;
    	
    	if(list1!=null || list2!=null)
    	{
    		Node more = sumOf2LLists(list1==null?null:list1.next, list2==null?null:list2.next, value >=10?1:0);
    		result.next=more;
    	}
    	
    	
    	return result;
    }
    
	@Override
	public String toString()
	{
		Node current = this.head;
		String result="";
		while(current!=null)
		{
			result+=current.data+" ";
			current=current.next;
		}
		return result;
	}
	
	public String display()
	{
		return toString();
	}
	
	
	public static void main(String[] args)
	{
		LinkedList linkedList1 = new LinkedList();
		linkedList1.insertAtHead(1);
		linkedList1.insertAtHead(6);
		linkedList1.insertAtHead(8);
		linkedList1.insertAtHead(9);
		linkedList1.insertAtHead(2);
		linkedList1.insertAtHead(3);
		linkedList1.insertAtHead(5);
		linkedList1.insertAtHead(7);
		linkedList1.insertAtHead(10);
		linkedList1.insertAtHead(20);
		
		LinkedList list1 =new LinkedList();
		list1.insertAtHead(5);
		list1.insertAtHead(6);
		list1.insertAtHead(9);
		
		LinkedList list2 = new LinkedList();
		list2.insertAtHead(9);
		list2.insertAtHead(7);
		list2.insertAtHead(5);
		
		Node result =sumOf2LLists(list1.head, list2.head, 0);

		/*System.out.println(linkedList1.display());
		linkedList1.deleteNode(20);
		System.out.println(linkedList1.display());
		linkedList1.deleteNode(200);
		System.out.println(linkedList1.display());*/
		
		//System.out.println(linkedList1.display());
		//linkedList1.removeDups();
		//linkedList1.removeDupsWithoutBuffer();
		//System.out.println(linkedList1.display());
		//linkedList1.returnKthToLast(5);
		//linkedList1.returnKth2LastRecursive(linkedList1.head, 5);
		//linkedList1.partition(7);
		//linkedList1.deleteFromMiddle(linkedList1.head.next.next.next);
		//System.out.println(linkedList1.display());
		System.out.println(list1.display());
		System.out.println(list2.display());
		
		System.out.println("After adding the two Lists of equal length");
		while(result!=null)
		{
			System.out.print(result.data+" ");
			result= result.next;
		}
		
		System.out.println("\nPALINDROME CHECK");
		LinkedList list3 =new LinkedList();
		list3.insertAtHead(1);
		list3.insertAtHead(2);
		list3.insertAtHead(3);
		list3.insertAtHead(2);
		list3.insertAtHead(1);
		//System.out.println("\nlist 3 is a palindrome: "+list3.palindromeList(list3.head));
		System.out.println("\nlist 3 is a palindrome: "+list3.palindrome2(list3.head));
		
	}
	
	public boolean palindromeList(Node head)
	{
		Node current=head;
		Node oldHead = head;
		//LinkedList before reversing
		System.out.println("\nBefore Reversing..");
		
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		Node reversedNode = reverseAndClone(current);
		Node newHead =reversedNode;
		System.out.println("\nAfter Reversing...");
		while(reversedNode!=null)
		{
			System.out.print(reversedNode.data+" ");
			reversedNode = reversedNode.next;
		}
		
		
		return isEqual(oldHead, newHead);
	}
	
	
	public boolean palindrome2(Node head)
	{
		Node slow = head;
		Node fast = head;
		Stack<Node> stack = new Stack<Node>();
		while(fast!=null && fast.next!=null)
		{
			stack.push(slow);
			slow =slow.next;
			fast =fast.next.next;
		}
		
		
		//if no of nodes is odd then skip the middle one(increase slow by one)
		if(fast!=null)
			slow=slow.next;
		
		while(slow!=null)
		{
			if(slow.data!=stack.pop().data)
			{
				return false;
			}
			slow =slow.next;
		}
		return true;
	}
	
	public boolean isEqual(Node oldHead, Node newHead)
	{
		while(oldHead!=null && newHead != null)
		{
			if(oldHead.data != newHead.data)
				return false;
			else
			{
				oldHead = oldHead.next;
				newHead = newHead.next;
			}
		}
		return oldHead==null && newHead==null;
	}
	
	public Node reverseAndClone(Node node)
	{
		Node head =null;
		while(node!=null)
		{
			Node n =new Node(node.data);
			n.next=head;
			head = n;
			node = node.next;
		}
		
		return head;
	}
}
