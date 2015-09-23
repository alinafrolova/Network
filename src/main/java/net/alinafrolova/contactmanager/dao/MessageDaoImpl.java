package net.alinafrolova.contactmanager.dao;

import net.alinafrolova.contactmanager.web.Contact;
import net.alinafrolova.contactmanager.web.Message;

import java.util.List;

/**
 * Created by Frolova.A on 9/23/15.
 */
public class MessageDaoImpl implements MessageDao {
    @Override
    public void storeMessage(Message message) {

    }

    @Override
    public List<Message> getConversation(Contact contactA, Contact contactB) {
        return null;
    }
}
