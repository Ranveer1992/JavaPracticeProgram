package com.basic.linklist;

public class DuplicateRemoveFromSLL {

	public static void main(String[] args) {
		CreateNode head = SLLExample.createSLL();
		SLLExample.displaySLL(head);
		
		CreateNode head1 = removedDuplicateElement(head);
		SLLExample.displaySLL(head1);
		
		CreateNode head2 = removedDuplicateElementSecond(head);
		SLLExample.displaySLL(head2);

	}
	private static CreateNode removedDuplicateElement(CreateNode head) {
		CreateNode p = head;
		if(p==null || p.next == null) {
			return p;
		}else {
			CreateNode q = p.next;
			while(q!=null) {
				if(p.key == q.key) {
					p.next=q.next;
					q=p.next;
				}else {
					p=p.next;
					q=p.next;
				}
			}
		}
		return head;
	}
	
	private static CreateNode removedDuplicateElementSecond(CreateNode head) {
		CreateNode curr = head;
		while(curr!=null) {
			CreateNode temp = curr;
			while(temp!=null && temp.key==curr.key) {
				temp = temp.next;
			}
			curr.next=temp;
			curr=curr.next;
		}
		return head;
	}


}
