package agenda.repository.classes;

import java.util.LinkedList;
import java.util.List;

import agenda.model.base.Contact;
import agenda.repository.interfaces.IRepositoryContact;

public class RepositoryContactMock implements IRepositoryContact {

    private List<Contact> contacts;

    public RepositoryContactMock() {
        contacts = new LinkedList<Contact>();
        try {
            Contact c = new Contact("Name1", "address1", "+4071122334455");
            contacts.add(c);
            c = new Contact("Name2", "address 2", "+4071122334466");
            contacts.add(c);
            c = new Contact("Name3", "address 3", "+4071122338866");
            contacts.add(c);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<Contact> getAll() {
        return new LinkedList<Contact>(contacts);
    }

    @Override
    public boolean add(Contact contact) {
        contacts.add(contact);
        return true;
    }

    @Override
    public boolean remove(Contact contact) {
        int index = contacts.indexOf(contact);
        if (index < 0) return false;
        else contacts.remove(index);
        return true;
    }

    @Override
    public boolean update(Contact item) {
        return false;
    }

}
