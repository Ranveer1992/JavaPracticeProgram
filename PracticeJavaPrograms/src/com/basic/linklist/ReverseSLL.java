package com.basic.linklist;

public class ReverseSLL {

	public static CreateNode reverseList(CreateNode head){
		if(head==null){
			return head;
		}else{
			CreateNode p,q,r;
			p=head;
			q=p.next;
			p.next=null;
			while(q!=null){
				r=q.next;
				q.next=p;
				p=q;
				q=r;
			}
			return p;
		}
	}
	public static void main(String[] args) {
		
		CreateNode head = SLLExample.createSLL();
		
		SLLExample.displaySLL(head);
		
		head = reverseList(head);
		
		SLLExample.displaySLL(head);
	}

}
