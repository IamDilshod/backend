package Tests;

import Contacts.Contact;

public class Book extends Contact{
    public String name;

    public Book(String name){
        super(name);
        this.name=name;
    }

    public static void main(String[] args) {
        Book contact = new Book("Alexandra");
        System.out.println(contact.getContacts());
        System.out.println(contact.name);
    }
}
