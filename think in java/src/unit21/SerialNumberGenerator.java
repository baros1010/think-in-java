package unit21;

public class SerialNumberGenerator {
private static volatile int number=0;
public static  synchronized int nextSerialNumber(){
	return number++;
}

}
