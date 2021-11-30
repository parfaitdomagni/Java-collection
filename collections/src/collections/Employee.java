package collections;

public class Employee {
	int id;
	double income;
	String name;
	String doj;
	
	public Employee() {
		
	}
	
	public Employee(int id, double income, String name, String doj) {
		this.id =id;
		this.income = income;
		this.name = name;
		this.doj = doj;
	}
	
	public int getId() {
		return id;
	}
	
	public double getIncome() {
		return income;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDoj() {
		return doj;
	}
	
	public void setID(int id) {
		this.id = id;
		
	}
	
	public void setIncome(double income) {
		this.income =income;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void setDoj(String dof) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", income=" + income + ", name=" + name + ", doj=" + doj + "]";
	}
	

}
