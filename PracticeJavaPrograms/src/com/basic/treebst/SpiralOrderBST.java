package com.basic.treebst;

public class SpiralOrderBST {

	public static void main(String[] args) {
		NodeBST root = CreateBST.createBST();
		System.out.println("Display preorder is :: ");
		CreateBST.preOrder(root);
		System.out.println("\nSpiral order are :: ");
		printSpiralOrder(root);

	}

	private static void printSpiralOrder(NodeBST root) {
		int h = CustomDAOBST.height(root);
		boolean ltr = false;
		for (int i = 1; i <= h; i++) {
			ltr = !ltr;
			spiralOrderRec(root, i, ltr);
		}

	}

	private static void spiralOrderRec(NodeBST root, int level, boolean ltr) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.key + " ");
		} else {
			if (ltr) {
				spiralOrderRec(root.left, level - 1, ltr);
				spiralOrderRec(root.right, level - 1, ltr);
			} else {
				spiralOrderRec(root.right, level - 1, ltr);
				spiralOrderRec(root.left, level - 1, ltr);
			}
		}

	}

}
