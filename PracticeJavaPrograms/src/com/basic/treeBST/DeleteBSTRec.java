package com.basic.treeBST;

import java.util.Scanner;

public class DeleteBSTRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter node which do you want to delete ?");
		try {
			int num = sc.nextInt();
			NodeBST root = CreateBST.createBST();
			System.out.println("Display preorder is :: ");
			CreateBST.preOrder(root);
			NodeBST root1 = deleteRec(root, num);
			System.out.println("\nAfter Delete Node Display preorder is :: ");
			CreateBST.preOrder(root1);
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			sc.close();
		}
	}

	private static NodeBST deleteRec(NodeBST root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);

		// if key is same as root's
		// key, then This is the
		// node to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder
			// successor (smallest in the right subtree)
			root.key = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}

		return root;
	}

	private static int minValue(NodeBST root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

}
