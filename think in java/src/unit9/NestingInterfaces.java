package unit9;

import unit9.A.B;

class A {
	interface B {
		void f();
	}

	public class Bimp implements B {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}
	}

	private class BImp2 implements B {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}
	}

	public interface C {
		void f();
	}

	public class CImp implements C {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}
	}

	public class Cimp3 implements C {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}
	}

	private interface D {
		void f();
	}

	private class DImp implements D {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}
	}

	public class DImp2 implements D {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}
	}

	public D getD() {
		return new DImp2();
	}

	private D dRef;

	public void receive(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}

	public interface H {
		void f();
	}
	void g();
}

public class NestingInterfaces {
	public class BImp implements A.B {

		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ

		}

		class CImp implements A.C {

			@Override
			public void f() {
				// TODO 自動生成されたメソッド・スタブ

			}
		}
		class EImp implements E{

			@Override
			public void g() {
				// TODO 自動生成されたメソッド・スタブ
				
			}
		
		}

		class EGImp implements E.G{

			@Override
			public void f() {
				// TODO 自動生成されたメソッド・スタブ
				
			}}
		class EImp2 implements E{

			@Override
			public void g() {
				// TODO 自動生成されたメソッド・スタブ
				
			}
			class EG implements E.G{

				@Override
				public void f() {
					// TODO 自動生成されたメソッド・スタブ
					
				}}
		}
	}
}
