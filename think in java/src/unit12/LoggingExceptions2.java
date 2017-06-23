package unit12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions2 {
	private static Logger logger=Logger.getLogger("haha");
	static void logException(Exception e){
		StringWriter trace=new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			throw new NullPointerException();
			
		}catch(NullPointerException e){
			logException(e);
		}
	}

}
