package com.basic.linklistdouble;

public class DCreateNode {
	int key;
	DCreateNode prev;
	DCreateNode next;
	public DCreateNode() {
		
	}
	public DCreateNode(int data){
		this.key=data;
		this.prev=null;
		this.next=null;
	}
}
