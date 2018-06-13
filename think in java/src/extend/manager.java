package extend;

public class manager extends employee {
	private String id;
	private String name;

	public manager(String id, String name) {
		super(id,name);
		this.id = id;
		this.name = name;
	}

	protected void getMessage(manager m) {
		System.out.println(id);
	}
}
