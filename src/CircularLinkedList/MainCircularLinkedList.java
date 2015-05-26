package CircularLinkedList;
import java.util.*;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;
public class MainCircularLinkedList<E> extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyLinkedList<E> City = new MyLinkedList<E>();
    int a, index,i;
    int offset=3;
    String search;
    
    E item;
    
    private GLabel Title=new GLabel("LIST ADT (Circular Linked List)");
   
    ;
    
    Scanner numofitems= new Scanner(System.in);
    Scanner items= new Scanner(System.in);
    Scanner main= new Scanner(System.in);
    Scanner find= new Scanner(System.in);
    
		
	
	public void run(){
		City.createlist();
		//System.out.print(City.isEmpty());
		add(Title, 10,12);
		
		main();
	}
	

    @SuppressWarnings("unchecked")
	private void add(){
    	
    	
    	System.out.print("Enter item index: ");
    	index = numofitems.nextInt();
    	System.out.print("Enter item: ");
    	item = (E) items.nextLine();
    	City.add(index, item);
 
    	
    }
    
    
    private void remove(){
    	
    	System.out.print("Enter item index: ");
    	index = numofitems.nextInt();
    	City.remove(index);
    }
    
    private void getitem(){
    	
    	System.out.print("Enter item index: ");
    	index = numofitems.nextInt();
    	System.out.println(index+") "+City.get(index));
    	System.out.print("\n");
    	}
    
    private void getsize(){
    	System.out.println("Size of list is "+City.size() );
    	System.out.print("\n");
    	
    }
    
    private void removeall(){
    	City.removeall();
    }
    
    private void displaylist(){
    	add(Title,10,12);
    	for(i = 1;i <=City.numItems;i++){
    		 GLabel item= new GLabel((i)+") "+ City.get(i));
    	     add(item, (getWidth() - item.getWidth())/2, getWidth()/10 + i * (item.getHeight() + offset));
    	}
    	        	
    }
    
    private void refresh(){
    	removeAll();
    	setBackground(Color.WHITE);
    }
    
  
    
  private void main(){
	 
		System.out.println("1) ADD/INSERT Item");
		System.out.println("2) REMOVE Item");
		System.out.println("3) GET Item");
		System.out.println("4) GET List Size");
		System.out.println("5) REMOVE ALL");
		System.out.println("ENTER CHOICE: ");
		a = main.nextInt();
		switch (a){
		
		case 1:
			  
			  add();
			  refresh();
			  displaylist();
			  main();
			  
		
		case 2:
			  remove();
			  refresh();
			  displaylist();
			  main();
			  
		case 3:
			 getitem();
			 main();
		
		case 4:
			  getsize();
			  main();
			  
		case 5:
			removeall();
			  refresh();
			  displaylist();
			  main();

	    default:
	    	  
			  System.out.println("Please enter a valid number!");
			  System.out.println("\n");
			  main();
			  
		}
	  
  }
}
