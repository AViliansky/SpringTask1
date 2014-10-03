import java.util.List;

/**
 * Created by lddaniild on 18.09.14.
 */
public interface ContactsService {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
