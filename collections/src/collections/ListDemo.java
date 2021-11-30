package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(89);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
//		for(Integer x: list) {
//			System.out.println(list);
			
//		}
	}

}
