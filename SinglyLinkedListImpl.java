package com.sky.pgm;

@SuppressWarnings("rawtypes")
public class SinglyLinkedListImpl<T> {
	
	private Node head;
	
	@SuppressWarnings("unchecked")
	public void add(T element){
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding: "+element);
		Node<T> tmp = head;
		while(true){
			if(tmp==null){
				head = nd;
				break;
			} else if(tmp.getNextref() == null) {
				tmp.setNextref(nd);
				break;
			} else{
				tmp = tmp.getNextref();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void traverse(){
		Node<T> tmp = head;
		while(true){
			if(tmp == null){
				break;
			}
			System.out.println(tmp.getValue()+"\t");
			tmp = tmp.getNextref();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void reverse(){
		System.out.println("Reversing the linkedlist");
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		
		while(current!=null){
			next = current.getNextref();
			current.setNextref(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<>();
		sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        sl.reverse();
        sl.traverse();

	}

}

class Node<T> implements Comparable<T> {
	private T value;
	private Node<T> nextref;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextref() {
		return nextref;
	}

	public void setNextref(Node<T> nextref) {
		this.nextref = nextref;
	}

	@Override
	public int compareTo(T arg0) {
		System.out.println("CompareTo called");
		if(arg0 == this.value){
			return 0;
		}
		else
			return 1;
	}
	
}