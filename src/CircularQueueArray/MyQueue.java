package CircularQueueArray;

public class MyQueue<E> implements Queue<E> {

	private final int Max = 5;
	private int  numItems;
	private int forDisplay = 0;
	E[] item;
	private int front, rear;
	 @SuppressWarnings("unchecked")
	E s= (E) " ";
	
	 @SuppressWarnings("unchecked")

	public void createQueue() {
		item = (E[])new Object[Max];
		front=-1;
		rear=-1;
		numItems=0;		
	}

	
	public void add(E item) {
		
	  	this.item[(rear+1)%Max]=item;
	  	if(front==-1){
	  		front++;
	  	}
		rear++;
		numItems++;
		if(forDisplay<Max){
			forDisplay++;
		}
	    
	}

	
	public void remove() {
		this.item[(front)%Max]=s;
		front++;
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
		return this.item[(front)%Max];
	}

	
	public E getRear() {
		return this.item[((rear)%Max)];
	}
	
	public int Front(){
		return front;
	}
	
	public int Rear(){
		return rear;
	}
	public int forDisplay(){
		return forDisplay;
	}

}
