package com.basic.treeBST;

import java.util.Scanner;

public class LCABST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Number::");
			int n1 = sc.nextInt();
			System.out.println("Enter Second Number::");
			int n2 = sc.nextInt();
			NodeBST root = CreateBST.createBST();
			System.out.println("Display preorder is :: ");
			CreateBST.preOrder(root);

			NodeBST lcaNode = lca(root, n1, n2);
			System.out.println("\nLCA of " + n1 + " and " + n2 + " is :: " + lcaNode.key);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
	}

	private static NodeBST lca(NodeBST root, int n1, int n2) {

		if (root == null)
			return null;

		// If both n1 and n2 are smaller than root, then LCA lies in left
		if (root.key > n1 && root.key > n2)
			return lca(root.left, n1, n2);

		// If both n1 and n2 are greater than root, then LCA lies in right
		if (root.key < n1 && root.key < n2)
			return lca(root.right, n1, n2);

		return root;
	}

}
