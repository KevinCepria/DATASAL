package QueueArrayList;

public class MyQueue<E> implements Queue<E> {

	private final int Max = 5;
	private int numItems;
	E[] item;
	private int front, rear;
	@SuppressWarnings("unchecked")

	public void createQueue() {
		item = (E[])new Object[Max];
		front=-1;
		rear=-1;
		numItems=0;
		
	}

	
	public void add(E item) {
		
		if(numItems==0)
		{
		this.item[rear+1]=item;
		front++;
		}
		else
		{
	    this.item[rear+1]=item;
		
		}
		rear++;
		numItems++;
		
	}

	
	public void remove() {
		front++;
		System.out.print(front);
		numItems--;
		
	}

	public E get(int index) {
		return this.item[index];
	}

	
	public boolean isEmpty() {
		return numItems==0;
	}

	public boolean isFull() {
		return numItems==Max;
	}

	public int size() {
		return numItems;
	}

	public E getFront() {
		return this.item[front];
	}

	
	public E getRear() {
		return this.item[rear];
	}
	
	public int Front(){
		return front;
	}
	
	public int Rear(){
		return rear;
	}

}
