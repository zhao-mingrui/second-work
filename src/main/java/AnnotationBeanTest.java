import com.zmr.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("User2.xml");
        UserController uc = (UserController) ac.getBean("userController");
        uc.testAnnotation();
    }
}
