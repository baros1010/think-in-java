package unit18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class House implements Serializable {
}

class Animal implements Serializable {
	private String name;
	private House house;
Animal(String name,House house){
	this.name=name;
	this.house=house;
}
	public String toString() {
		return name + "[" + super.toString() + "]" + house + "\n";
	}
}

public class MyWorld {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		House h=new House();
		List<Animal> animals=new ArrayList<Animal>();
		animals.add(new Animal("dog",h));
		animals.add(new Animal("duck",h));
		animals.add(new Animal("cat",h));
		System.out.println("animals"+animals);
		ByteArrayOutputStream buf=new ByteArrayOutputStream();
		ObjectOutputStream out=new ObjectOutputStream(buf);
		out.writeObject(animals);
		out.writeObject(animals);
		ByteArrayOutputStream buf2=new ByteArrayOutputStream();
		ObjectOutputStream out2=new ObjectOutputStream(buf2);
		out2.writeObject(animals);
		ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
		ObjectInputStream in2=new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
		List
		animals1=(List)in.readObject(),
		animals2=(List)in.readObject(),
		animals3=(List)in2.readObject();
		System.out.println("animals1"+animals1);
		System.out.println("animals2"+animals2);
		System.out.println("animals3"+animals3);
		
	}
}
