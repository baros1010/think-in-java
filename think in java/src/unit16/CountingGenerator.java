package unit16;

import java.util.Random;

import unit15.Generator;

public class CountingGenerator {
	 static Random rand=new Random(47);

	public static class Boolean implements Generator<java.lang.Boolean> {
		private boolean value = false;

		@Override
		public java.lang.Boolean next() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			value = rand.nextBoolean();
			return value;
		}

	}

	public static class Byte implements Generator<java.lang.Byte> {
		private byte value = 0;

		@Override
		public java.lang.Byte next() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			return value++;
		}
	}

	static char[] chars = ("auagsyugw" + "SAUDHIUWGE").toCharArray();

	public static class Character implements Generator<java.lang.Character> {
		int index = -1;

		@Override
		public java.lang.Character next() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			index = (index + 1) % chars.length;
			return chars[index];
		}

	}

	public static class String implements Generator<java.lang.String> {
		private int length=7;
		Generator<java.lang.Character> cg=new Character();
		public String(){}
		public String(int length){this.length=length;}
		
		@Override
		public java.lang.String next() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			char [] buf =new char[length];
			for(int i=0;i<length;i++)
				buf[i] = cg.next();
			return new java.lang.String(buf);
		}
	}
}
