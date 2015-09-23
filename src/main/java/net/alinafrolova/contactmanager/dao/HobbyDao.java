package net.alinafrolova.contactmanager.dao;

import net.alinafrolova.contactmanager.web.Contact;
import net.alinafrolova.contactmanager.web.Hobby;

import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
public interface HobbyDao {
    public void addHobby(Hobby hobby);
    public Set<Contact> getAllContactsWithHobby(Hobby hobby);
}
