package Contacts;

public class Contact {
   protected String name;

     protected Contact(String name){
        this.name=name;
    }

    public static void main(String[] args) {

    }

     public String getContacts(){
        return this.name;
    }
}
