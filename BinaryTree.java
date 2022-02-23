package com.Bridgelabz.BinaryTree;

public class BinaryTree {
	public static void main(String[] arg) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(63);
		myBinaryTree.add(98);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		System.out.println("Size of binary tree is: " + size);
		myBinaryTree.print();
		myBinaryTree.searchKey(70);
	}
}
