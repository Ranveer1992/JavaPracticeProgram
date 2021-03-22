package com.basic.treeBST;

public class NodeBST {
	int key;
	NodeBST root;
	NodeBST left;
	NodeBST right;

	public NodeBST() {

	}

	public NodeBST(int data) {
		this.key = data;
		this.left = null;
		this.right = null;
	}
}
