package Bridgelabz;

public class LinkedList {
	Node head;
	Node tail;
	
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}
	
	public void print() {
		if (head == null) {
			System.out.println("Linked list is Empty");	
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}
