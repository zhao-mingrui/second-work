import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanTest {
    public static void main(String[] args) {
        ApplicationContext cla = new ClassPathXmlApplicationContext("user.xml");

        System.out.println(cla.getBean("user1"));
        System.out.println(cla.getBean("user2"));

    }
}
