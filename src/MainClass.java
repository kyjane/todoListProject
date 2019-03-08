import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Do exercise 15 mins");
		list.add("read books 1 hour");
		list.add("read news 1 hour");
		showMenu(list);
	}
	
	public static void showMenu(ArrayList<String> list){
		
		for(int i=0; i<list.size();i++)
		{
		 System.out.println("To Do Item: " + list.get(i));
		}
	}
}
