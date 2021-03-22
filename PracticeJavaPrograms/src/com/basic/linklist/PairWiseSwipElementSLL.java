package com.basic.linklist;

public class PairWiseSwipElementSLL {

	public static void main(String[] args) {
		CreateNode head = SLLExample.createSLL();
		SLLExample.displaySLL(head);
		
		CreateNode head1 = pairWiseSwipeElement(head);
		SLLExample.displaySLL(head1);
		
	}

	private static CreateNode pairWiseSwipeElement(CreateNode head) {
		CreateNode cur = head;
		while(cur!=null && cur.next!=null) {
			int temp = cur.key;
			cur.key = cur.next.key;
			cur.next.key=temp;
			cur = cur.next.next;
		}
		return head;
	}

}
