package com.basic.treebt;

import java.util.Scanner;

public class CreateBTTree {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		NodeBT root = null;
		root = CreateTree();
		System.out.println("\nInorder print are :: ");
		inOrder(root);
		System.out.println("\nPreorder print are :: ");
		preOrder(root);
		System.out.println("\nPostorder print are :: ");
		postOrder(root);
	}

	private static NodeBT CreateTree() {
		NodeBT root = null;
		System.out.println("Enter data ::");
		int data = sc.nextInt();
		if (data == -1) {
			return null;
		}
		root = new NodeBT(data);
		System.out.println("Enter left for :: " + data);
		root.left = CreateTree();
		System.out.println("Enter right for :: " + data);
		root.right = CreateTree();
		return root;
	}

	private static void postOrder(NodeBT root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.key + " ");
	}

	private static void preOrder(NodeBT root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		inOrder(root.left);
		inOrder(root.right);
	}

	private static void inOrder(NodeBT root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.key + " ");
		inOrder(root.right);
	}

}
