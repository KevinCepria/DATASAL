package ArrayList;

public interface List<E> {
	
	public void initializelist ();
	
	
	public void add(int index, E item) throws ListisFullException, IndexOutOfBounds;
	
	
	public void remove (int index)throws IndexOutOfBounds;
	
	
	public E getitem(int index) throws IndexOutOfBounds;
	
	
	public int listsize ();
	
	
	public boolean isempty();
	
	
	public void removeall();
	
	}
