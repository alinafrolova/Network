package net.alinafrolova.contactmanager.dao;

import net.alinafrolova.contactmanager.web.Contact;
import net.alinafrolova.contactmanager.web.Hobby;
import net.alinafrolova.contactmanager.web.Place;

import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
public interface PlaceDao {
    public void addPlace(Place place);
    public Set<Contact> getAllContactsWithHobby(Hobby hobby);
}
