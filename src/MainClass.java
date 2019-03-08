import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream; 

import java.util.stream.Collectors; 
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Do exercise 15 mins");
		list.add("read books 1 hour");
		list.add("read news 1 hour");
		showMenu(list);
		
		 selectItem(list);

		
	}
	
	public static void showMenu(ArrayList<String> list){
		
		for(int i=0; i<list.size();i++)
		{
		 System.out.println("To Do Item: Item " + (i)+ " "  + list.get(i));
		}
	}

    
    public static void selectItem(ArrayList list) //remove item from list
    {
    	Scanner sc = new Scanner(System.in);
    	
    	boolean exit = false;
    
    	     
    	            System.out.println("Select Item to remove: ");
    	            sc = new Scanner(System.in);
    	            int index = sc.nextInt();
    	          
    	        
    	            list.remove(index); 
    	            System.out.println("Remaining Listing: " + list);
    	            
    	            
    }
}
