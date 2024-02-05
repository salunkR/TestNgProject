package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		System.out.println("This is al: "+al);
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println("This is al2: "+al2);
		
//		al2.removeAll(al);
//		System.out.println("Removing all"+ al2);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//Convert array to arrayList
		
		String arr[]= {"abc", "def", "ghi"};
		ArrayList <String>list=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
	}
}
