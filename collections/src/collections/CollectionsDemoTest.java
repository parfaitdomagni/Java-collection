package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemoTest {

	public static void main(String[] args) {
		List<CollectionsDemo2>empl = new ArrayList<CollectionsDemo2>();
		
		CollectionsDemo2 e1 = new CollectionsDemo2(101, "Parfait");
		empl.add(e1);

		CollectionsDemo2 e2 = new CollectionsDemo2(102, "Parfait");
		empl.add(e2);

		CollectionsDemo2 e3 = new CollectionsDemo2(103, "Parfait");
		empl.add(e3);

		CollectionsDemo2 e4 = new CollectionsDemo2(104, "Parfait");
		empl.add(e4);

		CollectionsDemo2 e5 = new CollectionsDemo2(105, "Parfait");
		empl.add(e5);

		CollectionsDemo2 e6 = new CollectionsDemo2(106, "Parfait");
		empl.add(e6);
		
		System.out.println(empl);
		
		for(CollectionsDemo2 emp: empl) {
			if(emp.getId() == 102)
				System.out.println(emp);
		}
		
	}

}
