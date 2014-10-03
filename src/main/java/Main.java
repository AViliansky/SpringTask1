import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lddaniild on 18.09.14.
 */
public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext contactContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Contact firstContact = (Contact)contactContext.getBean("contextContact1");
        Contact secondContact = (Contact)contactContext.getBean("contextContact2");
        ContactsDAOImpl contactsDAO = (ContactsDAOImpl)contactContext.getBean("ContactsDAOImpl1");*/
        ContactsServiceImpl contactsService = (ContactsServiceImpl)contactContext.getBean("ContactsServiceImpl1");
        System.out.println(contactsService.getAllContacts());
    }
}
