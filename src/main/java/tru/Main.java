package tru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 06/03/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Tru1 tru1 = context.getBean("tru1",Tru1.class);
        int tru = tru1.tru(2,1);
        System.out.println(tru);
    }
}
