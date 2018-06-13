package IOREVIEW;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;



public class XMLConvert<T extends APIRequest> {

public void Convert(Class<T> cl) throws FileNotFoundException, IOException{
	Field[] fields=cl.getDeclaredFields();
	Element element= new Element("userId");
	for(Field field:fields){
		String str=field.getName();
	
		element.appendChild(getXml(str));

		
	}
	Document doc=new Document(element);
	format(System.out,doc);
	format(new BufferedOutputStream(new FileOutputStream("user.xml")), doc);
}

private void format(OutputStream bufferedOutputStream, Document doc) throws IOException {
Serializer ser=new Serializer(bufferedOutputStream,"utf-8");
ser.setMaxLength(60);
ser.write(doc);
ser.flush();
	
}

private Element getXml(String str) {
	Element element=new Element(str);
	element.appendChild(str);
	return element;
}


}
