package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
		size = 0;
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next = tail;
		tail.prev = head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) throws NullPointerException
	{
		// TODO: Implement this method
		if (element==null) {
			throw new NullPointerException("value can not be null!");
		}
		LLNode<E> added = new LLNode<E>(element);
		tail.prev.next = added;
		added.prev = tail.prev;
		tail.prev = added;
		added.next = tail;
		this.size += 1;
		
		return false;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) throws IndexOutOfBoundsException
	{
		// TODO: Implement this method.
		if (index<0 || index>this.size-1) {
			throw new IndexOutOfBoundsException("Index Out Of Bound");
		}
		int i=-1;
		LLNode<E> target = head;
		while (i < index){
			target = target.next;
			i += 1;
		}
		return target.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) throws NullPointerException{
	
		
		if (element==null) {
		throw new NullPointerException("value can not be null!");
	}
	
	
		int i=-1;
		LLNode<E> target = head;
		while (i < index){
			target = target.next;
			i += 1;
		}
		LLNode<E> newNode = new LLNode<E>(element);
		
		
		target.prev.next = newNode;
		newNode.prev = target.prev;
		target.prev = newNode;
		newNode.next = target;
		
		this.size += 1;
		
	
		
		
		
		
	}


	/** Return the size of the list */
	public int size() 
	{
		return this.size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) throws IndexOutOfBoundsException
	{
		if (index<0 || index>(this.size-1)) {
			throw new IndexOutOfBoundsException("Index Out Of Bound");
		}
		int i=-1;
		LLNode<E> target = head;
		while (i < index){
			target = target.next;
			i += 1;
		}
		target.next.prev = target.prev;
		target.prev.next = target.next;
		this.size = this.size-1;
		return target.data;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) throws IndexOutOfBoundsException, NullPointerException
	{
		
		if (element==null) {
			throw new NullPointerException("value can not be null!");
		}
		if (index<0 || index>this.size-1) {
			throw new IndexOutOfBoundsException("Index Out Of Bound");
		}
		int i=-1;
		LLNode<E> target = head;
		while (i < index){
			target = target.next;
			i += 1;
		}
		E oldvalue = target.data;
		target.data = element;
		return oldvalue;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
