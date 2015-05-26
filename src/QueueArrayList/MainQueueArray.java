package QueueArrayList;

import java.awt.Color;
import java.util.Scanner;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;


public class MainQueueArray<E> extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyQueue<E> City = new MyQueue<E>();
    int a, index,i;
    int offset=3;
   
    
    E item;
    
    private GLabel Title=new GLabel("QUEUE ADT(Array)");
   
    ;
    
    Scanner numofitems= new Scanner(System.in);
    Scanner items= new Scanner(System.in);
    Scanner main= new Scanner(System.in);
    Scanner find= new Scanner(System.in);
    
		
	
	public void run(){
		City.createQueue();
		add(Title, 10,12);	
		main();
	}
	

    @SuppressWarnings("unchecked")
	private void add(){
    	
    	
    	 if(City.isFull())
    	{
    	System.out.println("\nQUEUE IS ALREADY FULL!\n");
    	}
    	else
    	{
    	System.out.print("Enter item: ");
    	item = (E) items.nextLine();
    	City.add(item);
    	System.out.println("\nQUEUE SIZE is "+ City.size());
    	System.out.println("QUEUE FRONT IS " + City.getFront());
    	System.out.println("QUEUE BACK IS " + City.getRear());
    	System.out.print("\n");
    	}
    	
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
    	for(i = City.Front();i <City.Rear()+1;i++){
    		GLabel item= new GLabel((i+1)+") "+ City.get(i));
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
    
    private void isFull(){
    	System.out.print("\nQUEUE IS FULL --> "+City.isFull()+"\n\n");
    }
    
  
    
  private void main(){
	 
		System.out.println("1) ADD");
		System.out.println("2) REMOVE FRONT");
		System.out.println("3) Check if Empty");
		System.out.println("4) Check if Full");
		System.out.println("5) REMOVE ALL");
		System.out.print("ENTER CHOICE: ");
		
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
			  isEmpty();
			  main();
			  
		case 4:
			  isFull();
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
