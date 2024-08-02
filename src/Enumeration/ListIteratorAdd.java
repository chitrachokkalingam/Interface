package Enumeration;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorAdd {
	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		
		ListIterator<String> li = v.listIterator();
		
		while(li.hasNext())
		{
		String next = li.next();
		if(next.equals("a"))
		{
			li.add("appium");
		}
		
		if(next.equals("c"))
		{
			li.set("camera");
		}
		
		if(next.equals("d"))
		{
			li.remove();
		}
		
		}
		System.out.println(v);
	}}



