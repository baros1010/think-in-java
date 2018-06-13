package callback;

public class SuperCalculator
{
    public void add(int a, int b, Student  xiaoming)
    {
        int result = a + b;
        xiaoming.fillBlank(a, b, result);
    }
}