package StackArrayList;
public class MyStack<E> implements Stack<E>{
     private int TOS;
     E[] item;
     private int MAX = 3;
     
	
	@SuppressWarnings("unchecked")
	public void createstack() {
		item=(E[]) new Object[MAX];
		TOS=-1;
	}

	public void push(E item) throws StackFullException{
		    if(isFull()){
		    	throw new StackFullException("Stack is Full!");
		    }
		    else{
			this.item[TOS+1]=item;
			TOS++;
		    }
			}

	public void pop(){
				TOS--;
		
	}

	public E get(int index) {
		return this.item[index];
	}

	public int size() {
		return (TOS+1);
	}

	public boolean isEmpty() {
		return (TOS==-1);
	}

	public boolean isFull() {
		return (TOS+1==MAX);
	}

	
	public E getTOS() {
		if(TOS==-1)
		{
		return null;
		}
		else
		{
		return item[TOS];	
		}
	}

}
