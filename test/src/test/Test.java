package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
        
            InputStream in = Test.class.getClassLoader().getResourceAsStream(
                    "tests.properties");
            prop.load(in);
            //直接输出prop对象
            System.out.println("直接输出prop对象:"+prop);
            //获取name的值
            String admin=prop.getProperty("admin");
            //获取address的值
            String password=prop.getProperty("password");
            //获取job的值
            
            System.out.println("admin="+admin+",password="+password);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}