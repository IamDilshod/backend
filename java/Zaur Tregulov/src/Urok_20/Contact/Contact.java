package Urok_20.Contact;

public class Contact {
    String contactName;
    String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public static Contact createContact(String contactName, String contactNumber ){
        return new Contact(contactName, contactNumber);
    }
}
