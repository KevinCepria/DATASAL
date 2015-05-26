package QueueLinkedList;

import java.awt.Color;
import java.util.Scanner;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;


public class MainQueueLinkedList<E> extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyQueue<E> City = new MyQueue<E>();
    int a, index,i;
    int offset=3;
   
    
    E item;
    
    private GLabel Title=new GLabel("QUEUE ADT(Linked List)");
   
    ;
    
    Scanner numofitems= new Scanner(System.in);
    Scanner items= new Scanner(System.in);
    Scanner reader= new Scanner(System.in);
    Scanner find= new Scanner(System.in);
    
		
	
	public void run(){
		City.createQueue();
		add(Title, 10,12);	
		main();
	}
	

    @SuppressWarnings("unchecked")
	private void add(){
    	
    	
    	
    	System.out.print("Enter item: ");
    	item = (E) items.nextLine();
    	City.add(item);
    	System.out.println("\nQUEUE SIZE is "+ City.size());
    	System.out.println("QUEUE FRONT IS " + City.getFront());
    	System.out.println("QUEUE BACK IS " + City.getRear());
    	System.out.print("\n");
    	
    	
    }
    
    
    private void remove(){
    	if(City.isEmpty()){
    	System.out.println("\nQUEUE IS EMPTY!\n");
    	}
    	else
    	{
    	System.out.println("\n"+City.getFront()+" Has been removed!");
    	City.remove();
    	System.out.println("QUEUE SIZE is "+ City.size());
    	     if(City.isEmpty()){
        	     System.out.println("QUEUE IS EMPTY!\n");
        	    }
    	      else{
    	    	System.out.println("QUEUE FRONT IS " + City.getFront());
    	      	System.out.println("QUEUE BACK IS " + City.getRear());
    	       }
    	System.out.print("\n");
    	}

    } 
    
    private void removeall(){
    	if(City.isEmpty())
    	{
    	System.out.println("\nSTACK IS EMPTY!\n");
    	}
    	else{
    	do
    	{
    	City.remove();
    	
    	}while(City.size()!=0);
    	System.out.println("\nQUEUE SIZE is "+ City.size());
    	System.out.println("QUEUE IS EMPTY!\n");
    	}
    	
    	
    }
    
    private void displaylist(){
    	add(Title,10,12);
    	for(i = 1;i <City.size()+1;i++){
    		GLabel item= new GLabel((i)+") "+ City.get(i));
    	     add(item, (getWidth() - item.getWidth())/2, getWidth()/10 + i * (item.getHeight() + offset)+(2*offset));
    	}
    	        	
    }
    
    private void refresh(){
    	removeAll();
    	setBackground(Color.WHITE);
    }
    
    private void isEmpty(){
    	System.out.print("\nQUEUE IS EMPTY --> "+City.isEmpty()+"\n\n");
    }
    
    
    
  
    
  private void main(){
	    while(true){
		System.out.println("\n\n1) ADD");
		System.out.println("2) REMOVE FRONT");
		System.out.println("3) Check if Empty");
		System.out.println("4) REMOVE ALL");
		System.out.print("ENTER CHOICE: ");
		
		try {
			a = reader.nextInt();
			}
			catch (Exception ex){
				System.err.println("\nInvalid Input!");			
				reader.nextLine();
				System.out.println("ENTER CHOICE AGAIN! ");
			}
		
		switch (a){
		
		case 1:
			  
			  add();
			  refresh();
			  displaylist();
			  break;
			  
		
		case 2:
			  remove();
			  refresh();
			  displaylist();
			  break;
			  
		case 3:
			  isEmpty();
			  break;
			  
		
		case 4:
			  removeall();
			  refresh();
			  displaylist();
			  break;
			  

	    default:
	    	  
			  System.err.println("\nPlease enter a valid number!");
			
			  
		} 
		}
	  
  }

}
