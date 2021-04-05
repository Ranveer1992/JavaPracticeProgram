package com.basic.treebst;

public class CustomDAOBST {

	public static void main(String[] args) {
		NodeBST root = CreateBST.createBST();
		System.out.println("Display preorder is :: ");
		CreateBST.preOrder(root);
		int h = height(root);
		System.out.println("\nBST height is :: " + h);
		int minNodeValue = minNode(root);
		System.out.println("\nminNodeValue :: " + minNodeValue);
		int maxNodeValue = maxNode(root);
		System.out.println("\nmaxNodeValue :: " + maxNodeValue);
		int totalNode = totalNode(root);
		System.out.println("\totalNode :: " + totalNode);
	}

	private static int totalNode(NodeBST root) {
		if (root == null) {
			return 0;
		}
		return 1 + totalNode(root.left) + totalNode(root.right);
	}

	private static int maxNode(NodeBST root) {
		if (root != null && root.right == null) {
			return root.key;
		}
		return maxNode(root.right);
	}

	private static int minNode(NodeBST root) {
		if (root != null && root.left == null) {
			return root.key;
		}
		return minNode(root.left);
	}

	public static int height(NodeBST root) {
		if (root == null) {
			return 0;
		}
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		if (lHeight > rHeight) {
			return lHeight + 1;
		} else {
			return rHeight + 1;
		}
	}
}
