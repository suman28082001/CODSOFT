import javax.swing.*;
import java.util.ArrayList;

class Contact{
    String name;
    String address;
    String emailaddress;
    String phonenumber;
    Contact(String n,String a, String ea,String pn){
        name=n;
        address=a;
        emailaddress=ea;
        phonenumber=pn;
    }
    void display(){
        JOptionPane.showMessageDialog(null, "name: "+ name + "Address: " + address + "emailaddress: " + emailaddress + "phonenumber: " + phonenumber);
    }
}
class AddressBook {
    ArrayList contact1;

    AddressBook() {
        contact1 = new ArrayList<>();
    }

    void addcontact1() {
        String name = JOptionPane.showInputDialog("Enter Name: ");
        String address = JOptionPane.showInputDialog("Enter Address: ");
        String emailaddress = JOptionPane.showInputDialog("Enter Email Address: ");
        String phonenumber = JOptionPane.showInputDialog("Enter Your PhoneNumber: ");
        Contact c = new Contact(name,address,emailaddress,phonenumber);
        contact1.add(c);
    }
    void searchcontact1(String n){
       for(int i=0;i<contact1.size();i++){
           Contact c = (Contact)contact1.get(i);
           if(n.equals(c.name)){
               c.display();
           }
       }
    }
    void deletecontact1(String n){
        for(int i=0;i< contact1.size();i++){
            Contact c = (Contact)contact1.get(i);
            contact1.remove(i);
        }
    }
}
public class Address {
    public static void main(String[] args) {
      AddressBook ab = new AddressBook();
      String input, s;
      int ch;
      while(true){
          input=JOptionPane.showInputDialog("Enter 1 to add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to exist");
          ch=Integer.parseInt(input);
          switch(ch){
              case 1:
                  ab.addcontact1();
                  break;
              case 2:
                  s=JOptionPane.showInputDialog("Enter name to search:");
                  ab.searchcontact1(s);
                  break;
              case 3:
                  s=JOptionPane.showInputDialog("Enter the name to delete: ");
                  ab.deletecontact1(s);
              case 4:
                  System.exit(0);

          }
      }

    }
}
