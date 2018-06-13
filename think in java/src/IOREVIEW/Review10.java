package IOREVIEW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Review10 implements Runnable{
	public static final Map<String, String> TEST_MAP = new ConcurrentHashMap<String, String>();
	public static int count=0;

	public  synchronized static Map<String, String> getServiceTimeproperties() {
		
		
		if(!TEST_MAP.isEmpty()){
			count=count+1;
			System.out.println("数据已有"+TEST_MAP.get("password100") +" "+count);
		}
		else{
			count++;
			Properties pro = new Properties();
			try {
				BufferedReader in = new BufferedReader(new FileReader("C:\\test.properties"));
				pro.load(in);
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

			Set<Object> ServiceTimeKeys = pro.keySet();

			for (Object ServiceTimeKey : ServiceTimeKeys) {
				String passwordResult = pro.getProperty((String) ServiceTimeKey);


				TEST_MAP.put((String) ServiceTimeKey, passwordResult);
			}
			System.out.println("创建的"+TEST_MAP.get("password100")  +" "+count);

		}

		return TEST_MAP;
	}

	public static void main(String[] args) {

		ExecutorService exc = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			exc.execute(new Review10());
	
		}
		

	}

	@Override
	public void run() {
		Map<String, String> map = getServiceTimeproperties();
	}
}
