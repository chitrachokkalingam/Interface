package Enumeration;

import java.util.ListIterator;
import java.util.Vector;

public class ListIterator1 {
	public static void main(String[] args) {
		Vector<String> li = new Vector();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.add("e");
		
		ListIterator<String> iterator = li.listIterator();
		System.out.println("Forward Direction:" +"\n" +"******");
		while(iterator.hasNext())
		{
			String next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("Backward direction:" +"\n" +"******");
		while(iterator.hasPrevious())
		{
			 String previous = iterator.previous();
			System.out.println(previous);
		}
		
	}

}
