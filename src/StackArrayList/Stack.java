package StackArrayList;

public interface Stack<E> {
	
	public void createstack (); 
	
	public void push(E item)throws StackFullException ;
	
	public void pop ();
	
	public E get(int index);
	
    public int size ();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public E getTOS();

}
