package com.basic.linklist;

import java.util.Scanner;

public class SLLExample {

	public static CreateNode createSLL() {
		Scanner sc = new Scanner(System.in);
		CreateNode head = null;
		try {
			CreateNode p = null;
			System.out.println("How many node do you want to create?");
			int n;
			n = sc.nextInt();
			System.out.println("Enter element is ::");
			for (int i = 0; i < n; i++) {
				int key = sc.nextInt();
				if (head == null) {
					head = new CreateNode(key);
					p = head;
				} else {
					p.next = new CreateNode(key);
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

	public static void displaySLL(CreateNode p) {
		System.out.println("Display SLL is::");
		while (p != null) {
			System.out.print(p.key + "->");
			p = p.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		CreateNode head = createSLL();
		displaySLL(head);
	}

}
