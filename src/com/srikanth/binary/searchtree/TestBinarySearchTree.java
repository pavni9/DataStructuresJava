package com.srikanth.binary.searchtree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = BinarySearchTree.addNode(null, 50);
		root = BinarySearchTree.addNode(root, 30);
		root = BinarySearchTree.addNode(root, 20);
		root = BinarySearchTree.addNode(root, 40);
		root = BinarySearchTree.addNode(root, 70);
		root = BinarySearchTree.addNode(root, 60);
		root = BinarySearchTree.addNode(root, 80);
		System.out.println("****Inorder****");
		BinarySearchTree.printNodeInOrder(root);
		System.out.println("****Preorder****");
		BinarySearchTree.printNodePreOrder(root);
		System.out.println("****Postorder****");
		BinarySearchTree.printNodePostOrder(root);

	}

}
