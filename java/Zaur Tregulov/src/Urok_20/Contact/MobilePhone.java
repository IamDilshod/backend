package Urok_20.Contact;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        int index = findContact(contact);
        System.out.println("index " + index);

        if ( index == -1){
            this.contacts.add(contact);
            return true;
        }

        return  false;
    }


    public Contact queryContact(String contactName){
        int index = findContact(contactName);

        if (index != -1){
            return this.contacts.get(index);
        }

        return null;
    }

    public boolean removeContact(Contact contact){
        int index = findContact(contact);

        if (index != -1){
            this.contacts.remove(index);
            return true;
        }

        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);

        if (index != -1){
            this.contacts.set(index, newContact);
            return true;
        }

        return false;
    }

    public void printContact(){
        for (Contact c : this.contacts){
            System.out.println(c.getContactName() + " => " + c.contactNumber);
        }
    }

    private int findContact(String contactName){
        for (int i=0; i<this.contacts.size(); i++){
            if (this.contacts.get(i).getContactName().equals(contactName)){
                return i;
            }
        }

        return -1;
    }

    private int findContact(Contact contact){
        for (int i=0; i<contacts.size(); i++){
            Contact cName = this.contacts.get(i);

            if (cName.getContactName().equals(contact.contactName)){
                return i;
            }
        }

        return -1;
    }
}
