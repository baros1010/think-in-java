package extend;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class client {
	public LocalDateTime getNowDt() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		client client =new client(); 
		String s=client.getNowDt().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")).substring(0, 8);
		System.out.println(s);
		
	}

}
