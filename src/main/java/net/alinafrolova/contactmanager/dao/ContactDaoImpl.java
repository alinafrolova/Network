package net.alinafrolova.contactmanager.dao;

import net.alinafrolova.contactmanager.web.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Frolova.A on 9/23/15.
 */

@Repository
//Аннотация показывает, что класс функционирует как репозиторий и требует наличия прозрачной трансляции исключений. Преимуществом трансляции исключений является то, что слой сервиса будет иметь дело с общей иерархией исключений от Спринга (DataAccessException) вне зависимости от используемых технологий доступа к данным в DAO слое.
public class ContactDaoImpl implements ContactDao {

    @Autowired     //Аннотация позволяет автоматически установить значение поля SessionFactory.
    private SessionFactory sessionFactory;

    @Override
    public void addContact(Contact contact) {

    }

    @Override
    public void deleteContact(Contact contact) {

    }

    @Override
    public void addFriendShip(Contact contact) {

    }

    @Override
    public void removeFriendShip(Contact contact) {

    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public void clearAll() {

    }
}
