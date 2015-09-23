package net.alinafrolova.contactmanager.service;

import net.alinafrolova.contactmanager.dao.ContactDao;
import net.alinafrolova.contactmanager.web.Contact;
import net.alinafrolova.contactmanager.web.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.util.resources.LocaleData;

import java.util.List;
import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
@Service
//Мы используем данную аннотацию, чтобы объявить, что этот класс представляет сервис – компонент сервис-слоя. Сервис является подтипом класса @Component. Использование данной аннотации позволит искать бины-сервисы автоматически (смотрите далее в root-context.xml).
public class JavaContactServiceImpl implements JavaContactService{

    @Autowired
    private ContactDao contactDAO;

    @Transactional
    @Override
    public void createContact(String contact, String contactB, LocaleData localdate) {

    }
    @Transactional
    //Перед исполнением метода помеченного данной аннотацией начинается транзакция, после выполнения метода транзакция коммитится, при выбрасывании RuntimeException откатывается.
    @Override
    public void addHobby(String hobbyA, String hobbyB) {

    }
    @Transactional
    @Override
    public void addPlace(String placeA, String placeB, double a, double b) {

    }
    @Transactional
    @Override
    public void addFriendship(Contact contactA, Contact contactB) {

    }
    @Transactional
    @Override
    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }
    @Transactional
    @Override
    public List<Message> getConversation(Contact contacta, Contact contactb) {
        return null;
    }
}
