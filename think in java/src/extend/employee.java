package extend;

public class employee {
	private String id;
	private String name;
	public employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	protected void getMessage( employee e) {
		System.out.println(e.id);
	}
}
