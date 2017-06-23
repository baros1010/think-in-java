package unit13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TestRegularExpression {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		if (args.length < 2) {
			System.out.println("Usage:njava TestRegularExpression" + "characterSequence TestRegularExpression");
			System.exit(0);
		}
		System.out.println("Input:\"" + args[0] + "\"");
		for (String arg : args) {
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while (m.find()) {
				System.out.println("Match\"" + m.group() + "\"at positions " + m.start() + "-" + (m.end() - 1));
			}
		}

	}

}
