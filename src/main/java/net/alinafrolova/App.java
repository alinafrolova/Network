package net.alinafrolova;

import net.alinafrolova.contactmanager.dao.ContactDao;
import net.alinafrolova.contactmanager.dao.ContactDaoImpl;
import net.alinafrolova.contactmanager.domain.Contact;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Frolova.A on 9/23/15.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        System.out.println(context.getBeansOfType(Contact.class));

        ContactDao contacts = context.getBean(ContactDaoImpl.class);

        System.out.println(contacts);

       // contacts.addContact();
    }
}
