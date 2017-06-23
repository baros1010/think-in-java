package unit12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception{
	private static Logger logger=Logger.getLogger("haha");//创建Looger
	public LoggingException(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class LoggingExceptions {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught"+e);
		}try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught"+e);
		}
	}

}
