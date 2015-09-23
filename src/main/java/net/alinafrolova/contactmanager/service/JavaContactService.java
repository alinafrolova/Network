package net.alinafrolova.contactmanager.service;

import net.alinafrolova.contactmanager.web.Contact;

import net.alinafrolova.contactmanager.web.Message;
import org.joda.time.LocalDate;

import java.util.List;
import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */

public interface JavaContactService {
    public void createContact(String contactA, String contactB, LocalDate localdate);
    public void addHobby (String hobbyA, String hobbyB);
    public void addPlace (String placeA, String placeB, double a, double b);
    public void addFriendship (Contact contactA, Contact contactB);
    public Set<Contact> getFriendList(Contact contact);
    public List<Message> getConversation(Contact contacta, Contact contactb);
}
