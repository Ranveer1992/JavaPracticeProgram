package com.basic.linklist;

import java.util.*;

public class SwapNodeSLL {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("First Node Is");
			int num1 = input.nextInt();
			System.out.println("Second Node Is");
			int num2 = input.nextInt();
			CreateNode head = SLLExample.createSLL();
			SLLExample.displaySLL(head);
			// CreateNode head1 = swapNode(head, num1, num2);
			// SLLExample.displaySLL(head1);

			CreateNode head2 = swapNodeSecond(head, num1, num2);
			SLLExample.displaySLL(head2);
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			input.close();
		}
	}

	private static CreateNode swapNode(CreateNode head, int x, int y) {
		// Nothing to do if x and y are same
		if (x == y)
			return head;

		// Search for x (keep track of prevX and CurrX)
		CreateNode prevX = null, currX = head;
		while (currX != null && currX.key != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		CreateNode prevY = null, currY = head;
		while (currY != null && currY.key != y) {
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return head;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else // make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else // make x the new head
			head = currX;

		// Swap next pointers
		CreateNode temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;

		return head;
	}

	private static CreateNode swapNodeSecond(CreateNode head, int num1, int num2) {
		if (num1 == num2) {
			return head;
		}
		// find X node value
		CreateNode prevX = null, curX = head;
		while (curX != null && curX.key != num1) {
			prevX = curX;
			curX = curX.next;
		}
		// find Y node value
		CreateNode prevY = null, curY = head;
		while (curY != null && curY.key != num2) {
			prevY = curY;
			curY = curY.next;
		}
		// either X or Y value is not available
		if (curX == null || curY == null) {
			return head;
		}
		// if X is not a head
		if (curX != head) {
			curX.next = curY;
		} else {
			head = curY;
		}
		// if Y is not a head
		if (curY != head) {
			curY.next = curX;
		} else {
			head = curX;
		}
		// swap node with the help of another node
		CreateNode temp = curX.next;
		curX.next = curY.next;
		curY.next = temp;
		// return the head node
		return head;
	}

}
