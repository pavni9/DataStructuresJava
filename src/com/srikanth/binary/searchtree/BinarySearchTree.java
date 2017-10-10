package com.srikanth.binary.searchtree;

public class BinarySearchTree {
	
	public static TreeNode addNode(TreeNode root,int data){
		TreeNode temp = root;
		if(root == null){
			return new TreeNode(data);
		}
		
		if(data<=root.data ){
			if(root.left != null)
				addNode(root.left,data);
			else
				root.left = new TreeNode(data);
		}
		
		if(data>root.data ){
			if(root.right != null)
				addNode(root.right,data);
			else
				root.right = new TreeNode(data);
		}		
		return temp;
	}
	
	public static void printNodeInOrder(TreeNode root){
		if(root ==null){
			System.out.println("Tree is empty");
		}
		if(root.left != null){
			printNodeInOrder(root.left);
		}
		System.out.println(root.data);
		if(root.right != null){
			printNodeInOrder(root.right);
		}
	}
	
	public static void printNodePreOrder(TreeNode root){
		if(root == null){
			System.out.println("Tree is empty");
		}
		
		System.out.println(root.data);
		if(root.left != null){
			printNodeInOrder(root.left);
		}
		if(root.right != null){
			printNodeInOrder(root.right);
		}
	}
	
	public static void printNodePostOrder(TreeNode root){
		if(root == null){
			System.out.println("Tree is empty");
		}
		if(root.left != null){
			printNodeInOrder(root.left);
		}
		if(root.right != null){
			printNodeInOrder(root.right);
		}
		System.out.println(root.data);
	}
}
