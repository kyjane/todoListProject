import java.util.ArrayList;

import java.util.List;
import java.util.stream.IntStream; 

import java.util.stream.Collectors; 

import java.util.Scanner;

public class MainClass {
	private static ArrayList<String> list = new ArrayList<String>();
	
	
	public static void main(String[] args){
			
		list.add("Do exercise 15 mins");
		list.add("read books 1 hour");
		list.add("read news 1 hour");
		showMenu(list);

		optionsmenu();
		readInput();
		 selectItem(list);

		
	}

		
		

	
	public static void showMenu(ArrayList<String> list){
		
		System.out.println("Your To-Do List.");
		for(int i=0; i<list.size();i++)
		{
		// System.out.println("To Do Item: Item " + (i)+ " "  + list.get(i));

			
		 System.out.println("To Do Item: " + list.get(i));
			

		}
	}
	public static void optionsmenu(){
		System.out.println("Menu: ");
		System.out.println("1. Add item");
		System.out.println("2. Remove item");
		System.out.println("3. Mark an item as complete");
		System.out.println("4. Exit ");
		System.out.print("Enter the number of your choice: ");
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

	
	public static void readInput(){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	
		
		if (input == 1){
			System.out.println("Please input your item");
			
			String data = sc.next();
			list.add(data);
			showMenu(list);
						
				
		} else if (input == 2){
			System.out.println("Please select number of the item to delete (starting from 1");
			int data = sc.nextInt();
			list.remove(data-1);
			showMenu(list);
	
		}
		sc.close();
	
	}
	

}
