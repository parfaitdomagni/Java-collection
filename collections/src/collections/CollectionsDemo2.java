package collections;

public class CollectionsDemo2 {
	int id;
	String name;
	public CollectionsDemo2() {
		
	}
	public CollectionsDemo2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CollectionsDemo2 [id=" + id + ", name=" + name + "]";
	}
	
	
}
