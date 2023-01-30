import java.util.ArrayList;

public class MobilePhone {

  private ArrayList<Contact> myContacts;

  public MobilePhone(ArrayList<Contact> myContacts) {
    this.myContacts = myContacts;
  }

  public boolean addNewContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("Contact already exists");
      return false;
    } else
      myContacts.add(contact);
    return true;
  }

  private int findContact(Contact contact) {
    return myContacts.indexOf(contact);
  }

  public String queryContact(Contact contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    } else
      return null;

  }

  public Contact queryContact(String contactName) {
    int position = findContact(contactName);
    if (position >= 0) {
      return myContacts.get(position);
    } else
      return null;
  }

  private int findContact(String contactName) {
    for (int i = 0; i < myContacts.size(); i++) {
      Contact contact = myContacts.get(i);
      if (contact.getName().equals(contactName)) {
        return i;
      }

    }
    return -1;
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    int position = findContact(oldContact);
    if (position < 0) {
      System.out.println("Contact " + oldContact.getName() + " was not found");
      return false;
    } else
      myContacts.set(position, newContact);
    return true;
  }

  public boolean removeContact(Contact contact) {
    int position = findContact(contact);
    if (position < 0) {
      return false;
    } else
      myContacts.remove(position);
    return true;
  }

  public void printContacts() {
    for (int i = 0; i < myContacts.size(); i++) {
      System.out.println("Name: " + myContacts.get(i).getName() +
        " Phone number: " + myContacts.get(i).getPhoneNumber());
    }
  }
}
