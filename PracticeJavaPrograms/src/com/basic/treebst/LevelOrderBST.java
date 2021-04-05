package com.basic.treebst;

public class LevelOrderBST {

	public static void main(String[] args) {
		NodeBST root = CreateBST.createBST();
		System.out.println("Display preorder is :: ");
		CreateBST.preOrder(root);
		printLevelOrder(root);

	}

	private static void printLevelOrder(NodeBST root) {
		int h = CustomDAOBST.height(root);
		for (int i = 1; i <= h; i++) {
			levelorderRec(root, i);
		}

	}

	private static void levelorderRec(NodeBST root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.key + " ");
		} else {
			levelorderRec(root.left, level - 1);
			levelorderRec(root.right, level - 1);
		}
	}

	

}
