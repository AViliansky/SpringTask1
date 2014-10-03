import java.util.List;

/**
 * Created by lddaniild on 18.09.14.
 */
public class ContactsServiceImpl implements ContactsService {

    private int maxSize;
    private ContactsDAOImpl contactsDAOInstance;

    public ContactsDAOImpl getContactsDAOInstance() {
        return contactsDAOInstance;
    }

    public void setContactsDAOInstance(ContactsDAOImpl contactsDAOInstance) {
        this.contactsDAOInstance = contactsDAOInstance;
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int getMaxSize(){
        return maxSize;
    }

    @Override
    public void addContact(Contact contact) {
        if (contactsDAOInstance.getListOfContacts().size()<=maxSize){
            contactsDAOInstance.setContact(contact);
        }
        else{
            this.deleteContact(contactsDAOInstance.getListOfContacts().get(0));
            contactsDAOInstance.setContact(contact);
        }
    }

    @Override
    public void deleteContact(Contact contact) {
        contactsDAOInstance.removeContact(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactsDAOInstance.getListOfContacts();
    }

    @Override
    public void clearAll() {
        contactsDAOInstance.getListOfContacts().clear();
    }

}
