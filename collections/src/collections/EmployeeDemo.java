package collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee>emplList = new ArrayList<>();
		
     	Employee e1 = new Employee(1, 99.00, "Parfait", "10-01-2021");
		emplList.add(e1);
		Employee e2 = new Employee(1, 99.00, "Parfait", "10-01-2021");
		emplList.add(e2);
		Employee e3 = new Employee(1, 99.00, "Parfait", "10-01-2021");
		emplList.add(e3);
		Employee e4 = new Employee(1, 99.00, "Parfait", "10-01-2021");
		emplList.add(e4);
		Employee e5 = new Employee(1, 99.00, "Parfait", "10-01-2021");
		emplList.add(e5);
		Employee e6 = new Employee(1, 99.00, "Parfait", "10-01-2021");
		emplList.add(e6);
		
		System.out.println(emplList);
		
	}

}
