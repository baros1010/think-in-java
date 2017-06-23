package unit18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter {
	private Pattern pattern;

	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return pattern.matcher(name).matches();
	}
}

public class DirList {

	public static void main(String[] args) {
		File file = new File(".");
		String [] list;
		
		if(args.length==0){
			list=file.list();
		}else
			list=file.list(new DirFilter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dir:list)
			System.out.println(dir);
	}
}
