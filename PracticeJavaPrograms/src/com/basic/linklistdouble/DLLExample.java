package com.basic.linklistdouble;

import java.util.Scanner;

public class DLLExample {

	public static void main(String[] args) {
		DCreateNode dlist = createDoubleLL();
		displayDoubleLL(dlist);
	}
	private static DCreateNode createDoubleLL() {
		DCreateNode head = null;
		DCreateNode p = new DCreateNode();
		int n;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("how many node do you want to create?");
			n = sc.nextInt();
			System.out.println("Insert node are ::");
			for (int i = 0; i < n; i++) {
				int item = sc.nextInt();
				DCreateNode temp = new DCreateNode(item);
				if (head == null) {
					head = temp;
					p = head;
				} else {
					p.next = temp;
					temp.prev = p;
					p = p.next;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
		return head;
	}
	private static void displayDoubleLL(DCreateNode p) {
		DCreateNode q = null;
		System.out.println("Display DLL is ::");
		System.out.print("null<<->>");
		while (p != null) {
			System.out.print(p.key + "<<->>");
			q=p;
			p = p.next;
		}
		System.out.println("null");
		System.out.println("Display DLL in Reverse Order is ::");
		System.out.print("null<<->>");
		while (q != null) {
			System.out.print(q.key + "<<->>");
			q = q.prev;
		}
		System.out.println("null");
	}

}
