package unit9;

import unit9.A.B;

class A {
	interface B {
		void f();
	}

	public class Bimp implements B {

		@Override
		public void f() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u

		}
	}

	private class BImp2 implements B {

		@Override
		public void f() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u

		}
	}

	public interface C {
		void f();
	}

	public class CImp implements C {

		@Override
		public void f() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u

		}
	}

	public class Cimp3 implements C {

		@Override
		public void f() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u

		}
	}

	private interface D {
		void f();
	}

	private class DImp implements D {

		@Override
		public void f() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u

		}
	}

	public class DImp2 implements D {

		@Override
		public void f() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u

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
			// TODO �����������ꂽ���\�b�h�E�X�^�u

		}

		class CImp implements A.C {

			@Override
			public void f() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u

			}
		}
		class EImp implements E{

			@Override
			public void g() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				
			}
		
		}

		class EGImp implements E.G{

			@Override
			public void f() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				
			}}
		class EImp2 implements E{

			@Override
			public void g() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				
			}
			class EG implements E.G{

				@Override
				public void f() {
					// TODO �����������ꂽ���\�b�h�E�X�^�u
					
				}}
		}
	}
}
