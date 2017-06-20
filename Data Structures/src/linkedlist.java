
public class linkedlist {
	// head
	    Node head;   
	 
	    
	    static class Node {
	        int data;
	        Node next;
	     // Constructor
	        Node(int d)  { 
	        	data = d; 
	        	next=null; } 
	    }
	    public void printList()
	    {
	        Node n = head;
	        while (n != null)
	        {
	            System.out.print(n.data+" ");
	            n = n.next;
	        }
	    }
	    public int Count()
	    {
	        Node temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	   
	    public static void main(String[] args)
	    {
	        
	        linkedlist llist = new linkedlist();
	 
	        llist.head  = new Node(1);
	        Node second = new Node(2);
	        Node third  = new Node(3);
	 
	        
	 
	        llist.head.next = second; // Link first node with  second 
	 
	       
	 
	        second.next = third; // Link second node with third 
	        System.out.println(llist.Count());
	 
	        
	    }
	}


