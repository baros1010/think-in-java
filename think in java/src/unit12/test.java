package unit12;

public class test { 
	 
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        System.out.println(new test().test());; 
    } 
 
    static int test() 
    { 
        int x = 1; 
        try 
        { 
            return x; 
        } 
        finally 
        { 
            ++x; 
            System.out.println(x); 
            System.out.println("aaa"); 
        } 
    } 
 
} 