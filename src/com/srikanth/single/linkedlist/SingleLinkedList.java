package com.srikanth.single.linkedlist;

public class SingleLinkedList {
	
	public static Node add(int data,Node head){
		if(head == null){
			Node headNode = new Node(data);
			return headNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data);
			return head;
		}
		
	}
	
	public static void printNodes(Node head){
		Node temp = head;
		if(head == null){
			System.out.println("No nodes in the linked list");
		}else{
			while(true){
				System.out.println("Node Value--->"+temp.data);
				if(temp.next == null){
					break;
				}
				temp = temp.next;
			}
		}
	}
	
	public static int countNodes(Node head){
		Node temp = head;
		int count =0;
		if(head == null){
			return count;
		}else{
			while(true){
				count++;
				if(temp.next == null){
					break;
				}
				temp = temp.next;				
			}
			return count;
		}
	}
	
	public static boolean find(int data,Node head){
		Node temp = head;
		if(head == null){
			return false;
		}else{
			while(true){
				if(temp.next == null){
					break;
				}
				if(temp.data == data){
					return true;
				}
				temp = temp.next;				
			}
		}
		return false;
	}
	
	//swapping first two nodes in the linked list	
	public static Node swapFirstTwoNodes(Node head){
		Node temp1 = head;
		Node temp2 = head.next;
		temp1.next = head.next.next;
		head = temp2;
		head.next = temp1;
		return head;
	}
	//printing middle node a linked list
	public static void printMiddleNodeValue(Node head){
		Node temp = head;
		int count = countNodes(head);
		int middle = count/2;
		int i=1;
		while(true){
			if(i==middle){
				break;
			}
			temp = temp.next;
			i++;
		}
		System.out.println("Middile Element value is ---->"+temp.data);
	}
	
	//printing nth Node form the last of a given linked List 
	public static void printNthNodeFromLast(Node head,int n){
		Node temp = head;
		int count = countNodes(temp);
		int numberOfNodeToJump = count-n;
		for(int i=0;i<numberOfNodeToJump;i++){
			temp = temp.next;
		}
		System.out.println("Nth Node form the last value is ---->"+temp.data);
	}
	
	//reversing a linked list
	public static Node reverseSingleLinkedList(Node head){
		Node previous = null;
		Node next = null;
		Node temp = head;
		while(temp != null){
			next = temp.next;
			temp.next = previous;
			previous = temp;
			temp =next;
			
		}
		return previous;
	}
	
	public static Node chunckNodeReverse(Node head,int k){
		
		   Node current = head;
	       Node next = null;
	       Node prev = null;
	        
	       int count = 0;
	 
	       /* Reverse first k nodes of linked list */
	       while (count < k && current != null) 
	       {
	           next = current.next;
	           current.next = prev;
	           prev = current;
	           current = next;
	           count++;
	       }
	 
	       if (next != null) 
	          head.next = chunckNodeReverse(next, k);
	 
	       return prev;
	}
	
	public static Node chunkRev(Node head,int k){
		Node prev = null;
		Node next = null;
		Node current = head;
		int j =0;
		while(j<k && current!= null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			j++;
		}
		
		if(next != null){
			head.next = chunkRev(next,k);
		}
		return prev;
	}
}
