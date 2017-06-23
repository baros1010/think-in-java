package callback;

public class Test
{
    public static void main(String[] args)
    {
        int a = 56;
        int b = 31;
        int c = 26497;
        int d = 11256;
        Student s1 = new Student("è¨ñæ");
        Seller s2 = new Seller("òVîkîk");
        
        s1.callHelp(a, b);
        s2.callHelp(c, d);
    }
}