package com.basic.treeBST;

public class LeftViewPrintBST {
	static int max_level = 0;

	public static void main(String args[]) {

		NodeBST root = CreateBST.createBST();
		System.out.println("Display preorder is :: ");
		CreateBST.preOrder(root);
		System.out.println("\n Display leftView tree is :: ");
		leftViewUtils(root);
	}

	private static void leftViewUtils(NodeBST root) {
		printLeftView(root, 1);
	}

	private static void printLeftView(NodeBST root, int level) {
		if (root == null)
			return;

		if (max_level < level) {
			System.out.println(root.key + " ");
			max_level = level;
		}
		printLeftView(root.left, level + 1);
		printLeftView(root.right, level + 1);
	}
}
