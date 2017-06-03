package nhan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 06/03/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Nhan1 n1 = context.getBean("nhan1",Nhan1.class);
        int nhan = n1.nhan(1,2);
        System.out.println(nhan);
    }
}
