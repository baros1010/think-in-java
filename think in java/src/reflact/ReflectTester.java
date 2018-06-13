package reflact;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester
{

    // 该方法实现对Customer对象的拷贝操作
    public Object copy(Object object) throws Exception
    {
        Class<?> classType = object.getClass();


   
        
        Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});
        
        //获得对象的所有成员变量
        Field[] fields = classType.getDeclaredFields();
        for(Field field : fields)
        {
            //获取成员变量的名字
            String name = field.getName();    //获取成员变量的名字，此处为id，name,age
            //System.out.println(name);

            //获取get和set方法的名字
            String firstLetter = name.substring(0,1).toUpperCase();    //将属性的首字母转换为大写            
            String getMethodName = "get" + firstLetter + name.substring(1);
            String setMethodName = "set" + firstLetter + name.substring(1);            
            //System.out.println(getMethodName + "," + setMethodName);
            
            //获取方法对象
            Method getMethod = classType.getMethod(getMethodName, new Class[]{});
            Method setMethod = classType.getMethod(setMethodName, new Class[]{field.getType()});//注意set方法需要传入参数类型
            
            //调用get方法获取旧的对象的值
            Object value = getMethod.invoke(object, new Object[]{});
            //调用set方法将这个值复制到新的对象中去
            setMethod.invoke(objectCopy, new Object[]{value});

        }

        return objectCopy;

    }

    public static void main(String[] args) throws Exception
    {
        Customer customer = new Customer("Tom",20);
        customer.setId(1L);
        ReflectTester tester = new ReflectTester();
        
        Customer customer2 = (Customer)tester.copy(customer);
        
        System.out.println(customer2.getId() + "," + customer2.getName() + "," + customer2.getAge());
        
    }
}

class Customer
{
    private long id;
    private String name;
    private int age;

    public Customer()
    {
    }

    public Customer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
