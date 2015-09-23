package net.alinafrolova.contactmanager.dao;

import net.alinafrolova.contactmanager.web.Contact;
import net.alinafrolova.contactmanager.web.Hobby;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {
    @Override
    public void addHobby(Hobby hobby) {

    }

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {
        return null;
    }
}
