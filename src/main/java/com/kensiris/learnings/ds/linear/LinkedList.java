package com.kensiris.learnings.ds.linear;

public class LinkedList {

	private Node head;
	static class Node{
		String data;
		Node next;
		public Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void push(String data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public Node searchNode(String data){
		if(data!=null || data.isEmpty()){
			Node node = head;
			while(node!=null){
				if(node.data.equalsIgnoreCase(data))
					return node;
				
				node = node.next;
			}
		}
		System.out.println("Node Not Found");
		return null;
	}
	public void insertAfter(String prevNodeData, String newNodeData){
			Node searchedNode = searchNode(prevNodeData);
			if(searchedNode!=null){
			Node newNode = new Node(newNodeData);
			newNode.next = searchedNode.next;
			searchedNode.next = newNode;
			}
	}
	
	public void append(String data){
		Node headN = head;
		while(headN!=null){
			if(headN.next==null){
				Node newN = new Node(data);
				headN.next = newN;
				break;
			} else{
				headN = headN.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		Node first = new Node("First");
		Node second = new Node("Second");
		Node third = new Node("Third");
		ls.head = first;
		first.next = second;
		second.next = third;
		ls.push("Zero");
		ls.insertAfter("Second", "second half");
		ls.append("Fourth");
		ls.append("Fifth");
		ls.printList();
	}

}
