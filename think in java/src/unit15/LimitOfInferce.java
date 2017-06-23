package unit15;

import java.util.List;
import java.util.Map;

import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class LimitOfInferce {
static void f(Map<Person,List<? extends Pet>>petss){}
public static void main(String[] args){
	f(New.map());
}
}
