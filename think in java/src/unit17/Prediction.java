package unit17;

import java.util.Random;

public class Prediction {
private static Random rand= new Random(47);
private static boolean sha=rand.nextDouble()>0.5;
public String toString(){
	if(sha){
		return "hh";
	}else{
		return "xx";
	}
	
}
}
