package com.basic.treeBST;

import java.util.LinkedList;
import java.util.Queue;

public class GivenArrayIsLevelOrderBST {
	static class NodeDetails {
		int data;
		int min, max;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };
		int n = arr.length;
		if (levelOrderIsOfBST(arr, n))
			System.out.print("Yes");
		else
			System.out.print("No");

	}

	private static boolean levelOrderIsOfBST(int[] arr, int n) {
		// if tree is empty
		if (n == 0) {
			return true;
		}
		int i = 0;
		Queue<NodeDetails> q = new LinkedList<NodeDetails>();
		NodeDetails newNode = new NodeDetails();
		newNode.data = arr[i++];
		newNode.min = Integer.MIN_VALUE;
		newNode.max = Integer.MAX_VALUE;
		q.add(newNode);
		while (i != n && q.size() > 0) {
			
			NodeDetails temp = q.peek();
			q.remove();
			newNode = new NodeDetails();

			if (i < n && (arr[i] < temp.data && arr[i] > temp.min)) {

				newNode.data = arr[i++];
				newNode.min = temp.min;
				newNode.max = temp.data;
				q.add(newNode);
			}
			newNode = new NodeDetails();

			if (i < n && (arr[i] > temp.data && arr[i] < temp.max)) {

				newNode.data = arr[i++];
				newNode.min = temp.data;
				newNode.max = temp.max;
				q.add(newNode);
			}
			if (i == n) {
				return true;
			}

		}
		return false;
	}

}
