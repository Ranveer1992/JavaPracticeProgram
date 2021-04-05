package com.basic.treebst;

import java.util.Scanner;

public class CreateBST {
	public static NodeBST createBST() {
		NodeBST root = null;
		NodeBST p = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("how many node do you want to create?");
			int n = sc.nextInt();
			System.out.println("Insert node is :: ");
			for (int i = 0; i < n; i++) {
				int data = sc.nextInt();
				NodeBST temp = new NodeBST(data);
				if (root == null) {
					root = temp;
					p = root;
				} else {
					p = root;
					while (true) {
						if (p.key >= temp.key) {
							if (p.left == null) {
								p.left = temp;
								break;
							}
							p = p.left;
						} else {
							if (p.right == null) {
								p.right = temp;
								break;
							}
							p = p.right;
						}
					}

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
		return root;
	}

	public static void preOrder(NodeBST root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void main(String[] args) {
		NodeBST root = createBST();
		System.out.println("Display preorder is :: ");
		preOrder(root);
	}

}
