package tinhtong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 06/03/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TinhTong1 tt1 = context.getBean("123",TinhTong1.class);
        int sum = tt1.add(1,2);
        System.out.println(sum);
    }
}
