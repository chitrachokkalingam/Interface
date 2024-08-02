package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration {
	
	public static void main(String[] args) {
	
//		Vector<String> e = new Vector();
//		e.add("a");
//		e.add("b");
//		e.add("c");
//		e.add("d");
//		
//		Enumeration<String> elements = e.elements();
//		while(elements.hasMoreElements())
//		{
//			String nextElement = elements.nextElement();
//			System.out.println(nextElement);
//		}
//		
//	}

		Vector e = new Vector();
		e.add("1");
		e.add("2");
		e.add("3");
		e.add("4");
		e.add("5");
		Enumeration elements = e.elements();
		while(elements.hasMoreElements())
		{
			Object nextElement = elements.nextElement();
		
			System.out.println(nextElement);
		}
		
		
		
		
		
}
}
