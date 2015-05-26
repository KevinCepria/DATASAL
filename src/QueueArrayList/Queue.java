package QueueArrayList;

public interface Queue <E> {
	
	public void createQueue();
	
	public void add(E item);
	
	public void remove();
	
	public E get(int index);
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public int size();
	
	public E getFront();
	
	public E getRear();
	
	public int Front();
	
	public int Rear();
	
}
