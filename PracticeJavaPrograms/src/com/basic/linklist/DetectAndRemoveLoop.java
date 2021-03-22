package com.basic.linklist;

import java.util.LinkedList;

public class DetectAndRemoveLoop {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private int detectAndRemoveLoop(Node head2) {
		Node slow = head2, fast = head2;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				//removeLoop(slow, head2);
				removeLoopSecondMethod(slow, head2);
				return 1;
			}
		}
		return 0;
	}

	private void removeLoopSecondMethod(Node loop, Node head2) {
		//set path pointer to loop
		Node ptr1=loop;
		Node ptr2=loop;
		int k=1;
		//find loop size
		while(ptr2.next!=ptr1) {
			k++;
			ptr2=ptr2.next;
		}
		//set first and second pointer to head
		ptr1=head2;
		ptr2=head2;
		//set kth node to ptr2
		for(int i=0;i<k;i++) {
			ptr2=ptr2.next;
		}
		//find the cycle first node 
		while(ptr1!=ptr2) {
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		//find the last node
		while(ptr2.next!=ptr1) {
			ptr2=ptr2.next;
		}
		//set null to the last pointer
		ptr2.next=null;
		
	}

	private void removeLoop(Node loop, Node head) {
		Node ptr1 = null, ptr2 = null;
		ptr1 = head;
		while (true) {
			ptr2 = loop;
			while (ptr2.next != loop && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			if (ptr2.next == ptr1) {
				break;
			}
			ptr1 = ptr1.next;
		}
		ptr2.next = null;
	}

	private void printList(Node head2) {
		while (head2 != null) {
			System.out.print(head2.data + " ");
			head2 = head2.next;
		}

	}

	public static void main(String[] args) {
		DetectAndRemoveLoop list = new DetectAndRemoveLoop();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		list.printList(head);

	}
}
