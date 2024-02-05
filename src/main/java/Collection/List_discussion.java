package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List_discussion {


	public static void main(String[] args) {


		ArrayList al=new ArrayList();
		al.add(1);
		al.add("Bhushan");
		al.add(15.5);
		al.add('A');
		al.add(false);
		al.add(5,"Pune");

		System.out.println(al);//[1, Bhushan, 15.5, A, false]


		System.out.println(al.size());//5

		//		al.remove(false);
		//		System.out.println("After removing "+al);
		//	
		//		al.remove("Bhushan");
		//		System.out.println("After removing of char "+al);

		//		al.remove(4);
		//		System.out.println(al);


		System.out.println("getting element "+al.get(3));		
		//		ArrayList<Character> charList = new ArrayList<>();
		//		charList.add('a');
		//		charList.add('b');
		//		charList.add('c');
		//		charList.add('a');
		//		char targetChar = 'a';
		//		charList.removeIf(character -> character.equals(targetChar));
		//		
		//		System.out.println("Char List"+charList);

		al.set(2, "welcome");
		System.out.println(al);

		System.out.println(al.contains("welcomee"));

		System.out.println("Final list elements: "+al);
		System.out.println("size "+al.size());
		
		//using for loop
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		//for-each loop
		System.out.println("Using for each loop");
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		//Using Iterator
		System.out.println("******** Using iterator ***********");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
