package com.basic.linklist;

import java.util.HashSet;

public class DuplicateRemoveFromUSLL {

	public static void main(String[] args) {
		CreateNode head = SLLExample.createSLL();
		SLLExample.displaySLL(head);
		
		CreateNode head1 = removedDuplicateElement(head);
		SLLExample.displaySLL(head1);
		
		CreateNode head2 = removedDuplicateElementSecond(head);
		SLLExample.displaySLL(head2);
	}

	

	private static CreateNode removedDuplicateElement(CreateNode head) {
		CreateNode curr = head;
		while(curr!=null && curr.next!=null) {
			CreateNode temp = curr;
			while(temp.next!=null) {
				if(curr.key==temp.next.key) {
					temp.next=temp.next.next;
				}else {
					temp=temp.next;
				}
			}
			curr = curr.next;
		}
		return head;
	}
	
	private static CreateNode removedDuplicateElementSecond(CreateNode head) {
		CreateNode curr = head;
		HashSet<CreateNode> hs = new HashSet<CreateNode>();
		CreateNode temp = null;
		while(curr!=null) {
			if(hs.contains(curr)) {
				temp.next=curr.next;
			}else {
				hs.add(curr);
				temp=curr;
			}
			curr=curr.next;
		}
		return head;
	}

}
