package callback;

public class Student {
	private String name = null;

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class doHomeWork implements doJob {

		@Override
		public void fillBlank(int a, int b, int result) {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("小明求助小红"+result);
		}
	}
    public void callHelp (int a, int b)
    {
        new SuperCalculator().add(a, b, new doHomeWork());
    }
}
