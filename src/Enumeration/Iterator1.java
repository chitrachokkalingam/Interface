package Enumeration;

import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {
	
	public static void main(String[] args) {
		
	Vector<String> v = new Vector();
	v.add("a");
	v.add("b");
	v.add("c");
	v.add("d");
	v.add("e");
	
Iterator<String> i = v.iterator();
while(i.hasNext())
{
	String next = i.next();
	if(next.equals("c"))
	{
		i.remove();
	}
}
	
	System.out.println(v);
	
}
}
	
	
	
	



