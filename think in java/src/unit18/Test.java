package unit18;

import java.io.FileInputStream;
import java.util.Scanner;  
public class Test {  
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
    public static void main(String[] args) throws Exception  
    {  
          
//        PrintStream ps=new PrintStream(new FileOutputStream(file));  
//        System.setOut(ps);  
//        System.out.println("Hello World!");  
    	 FileInputStream fis=new FileInputStream(file);  
         System.setIn(fis);  
           
         Scanner sc=new Scanner(System.in);  
         while(sc.hasNextLine())  
         {  
             System.out.println(sc.nextLine());  
         }  
           
  
    }  
      
  
  
      
}  