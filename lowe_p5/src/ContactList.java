import java.util.*;

public class ContactList {

    private ArrayList<ContactItem> contactList;
    Scanner sc=new Scanner(System.in);
    public ContactList()
    {
        this.contactList = new ArrayList<ContactItem> ();

    }

    public void AddItemToList()
    {

        ContactItem contactItem = new ContactItem();
        System.out.println("First name:");
        boolean b = contactItem.setFirstName(sc.nextLine());
        System.out.println("Last name");
        boolean b1 = contactItem.setLastName(sc.nextLine());
        System.out.println("Phone number (xxx-xxx-xxxx):");
        boolean b2 = contactItem.setPhoneNumber(sc.nextLine());
        System.out.println("Email address (x@y.z):");
        boolean b3 = contactItem.setEmailAddress(sc.nextLine());
        if((b || b1) && b2  || b3)
            this.contactList.add(contactItem);
        else
        {
            System.out.println("Either of names or phone number or email should not be empty");
        }

    }

    public boolean AddItemToList(String fn,String ln,String pn,String em)
    {
        ContactItem c  =new ContactItem();
        boolean b1 = c.setFirstName(fn);
        boolean b2= c.setLastName(ln);
        boolean b3 = c.setPhoneNumber(pn);
        boolean b4 = c.setEmailAddress(em);
        boolean b = (b1 || b2 ) || b3 || b4 ;
        if(b)
        {
            this.contactList.add(c);
        }
        return b;
    }

    public boolean EditItemToList(int index,String fn,String ln,String pn,String em)
    {
        if(index >= 0 && index < this.contactList.size())
        {
            ContactItem c  =new ContactItem();
            boolean b1 = c.setFirstName(fn);
            boolean b2= c.setLastName(ln);
            boolean b3 = c.setPhoneNumber(pn);
            boolean b4 = c.setEmailAddress(em);
            boolean b = (b1 || b2 ) || b3 || b4 ;
            if(b)
            {
                this.contactList.set(index,c);
            }
            return b;
        }
        else
            return false;

    }

    public int getSize()
    {
        return this.contactList.size();
    }
    public void ViewContacts()
    {
        System.out.println("Current Contacts");
        System.out.println("-----------------");
        int count = 0;
        for(ContactItem item : contactList)
        {
            System.out.println(count+")"+ "Name:" + "\t"+ item.getFirstName() + "\t" + item.getLastName());
            System.out.println("Phone:" + "\t" + item.getPhoneNumber());
            System.out.println("Email:"+"\t"+item.getEmailAddress());
            count++;
        }
    }

    public void EditContacts()
    {
        System.out.println("Current Contacts");
        System.out.println("-----------------");
        int count = 0;
        for(ContactItem item : contactList)
        {
            System.out.println(count+")"+ "Name:" + "\t"+ item.getFirstName() + "\t" + item.getLastName());
            System.out.println("Phone:" + "\t" + item.getPhoneNumber());
            System.out.println("Email:"+"\t"+item.getEmailAddress());
            count++;
        }
        int index;
        System.out.println("Which contact will you edit? ");
        index = sc.nextInt();

        if(index >= 0 && index < this.contactList.size())
        {
            ContactItem contactItem = new ContactItem();
            System.out.println("Enter a new first name for contact" + index +":");
            boolean b=contactItem.setFirstName(sc.nextLine());
            System.out.println("Enter a new last name for contact"+ index +":");
            boolean b1=contactItem.setLastName(sc.nextLine());
            System.out.println("Enter a new phone number (xxx-xxx-xxxx) for contact "+index+":");
            boolean b2=contactItem.setPhoneNumber(sc.nextLine());
            System.out.println("Enter a new email address (x@y.z) for contact "+index+":");
            boolean b3=contactItem.setEmailAddress(sc.nextLine());
            if((b || b1) || b2  || b3)
                this.contactList.set(index, contactItem);
            else
            {
                System.out.println("Either of names or phone number or email should not be empty");
            }
        }
        else
        {
            System.out.println("invalid index");

        }

    }

    public void removeContacts()
    {
        System.out.println("Current Contacts");
        System.out.println("-----------------");
        int count = 0;
        for(ContactItem item : contactList)
        {
            System.out.println(count+")"+ "Name:" + "\t"+ item.getFirstName() + "\t" + item.getLastName());
            System.out.println("Phone:" + "\t" + item.getPhoneNumber());
            System.out.println("Email:"+"\t"+item.getEmailAddress());
            count++;
        }
        int index;
        System.out.println("Which contact will you remove? ");
        index = sc.nextInt();
        if(index >=0 && index< this.contactList.size())
        {
            contactList.remove(index);
        }
        else
        {
            System.out.println("invalid index ");
        }
    }

    public boolean LoadExistingContactList()
    {
        System.out.println("Enter the filename to load");
        String fileName = sc.nextLine();
        System.out.println("contact list has been loaded");
        return true;
    }

    public boolean removeContacts(int i) {
        if(i >=0 && i< this.contactList.size())
        {
            this.contactList.remove(i);
            return true;
        }

        else
            return false;
    }
}
