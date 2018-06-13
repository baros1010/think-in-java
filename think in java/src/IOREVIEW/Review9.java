package IOREVIEW;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Review9 {
	public static void exportCSV(File file, List<String> dataList) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			
			bw.write(new String(new byte[] { (byte) 0xEF, (byte) 0xBB,(byte) 0xBF }));
			if (dataList.size() != 0) {
				for (String data : dataList) {
					bw.append(data).append("\n");
				}
			}
			bw.close();
		} catch (FileNotFoundException e) {

			throw new RuntimeException("SVBB9012[" + file.getName() + "] " + e);
		} catch (Exception e) {
			throw new RuntimeException("SVBB9007[" + file.getName() + "] " + e);
		}
		
	}
	public static void main(String[] args) {
		File file=new File("C:\\TEST.csv");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		   List<String> dataList=new ArrayList<String>();
	        dataList.add("1,张三,男");
	        dataList.add("2,李四,男");
	       
	        exportCSV(file,dataList);
	}
}
