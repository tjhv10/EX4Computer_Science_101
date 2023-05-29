package GameEx_Final.GameEx_Final;

import GameEx_Final.GameEx_Final.LinkedListInterface;
import GameEx_Final.GameEx_Final.NodeInterface;

/**
 * This is a simple LinkedList class that implements LinkedListInterface.
 * Ex4: you should implement this class!
 * @author Asaly.Saed
 *
 */
public class LinkedList implements LinkedListInterface {
private Node head;
	@Override
	public Node getHead() {
		return head;
	}
	@Override
	public void add(NodeInterface p) {
		Node node = new Node(p.getData(),null);
		if (this.head==null)
		{
			head=node;
		}
		else {
			Node list =this.head;
			while (list.getNext() != null) {
				list = (Node)list.getNext();
			}
			list.setNext(node);
		}
	}
	@Override
	public void remove(NodeInterface p) {
		Node list = this.head;
		if (head == p) {
			head =(Node) list.getNext();
		}
		else {
			while (list.getNext() != p) {
				list = (Node) list.getNext();
				if (list.getNext() == null)
					return;
			}
			list.setNext(list.getNext().getNext());
		}
	}

	
	
}
