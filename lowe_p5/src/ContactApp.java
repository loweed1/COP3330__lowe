import java.util.Scanner;

public class ContactApp {
    private int mainMenuOption;
    private ContactList contactList = new ContactList();
    public ContactApp()
    {

    }

    public void prinMainMenu()
    {


        while(mainMenuOption!=3)
        {
            System.out.println("Main Menu");
            System.out.println("------------------------");
            System.out.println("1)create a new list");
            System.out.println("2)load an existing list");
            System.out.println("3) quit");
            Scanner sc =new Scanner(System.in);
            int  mainMenuOption = sc.nextInt();
            if(mainMenuOption==1)
            {



                int listOperation;
                boolean mainmenu =false;
                while(!mainmenu)
                {
                    System.out.println("List Operation Menu\r\n" +
                            "---------\r\n" +
                            "");
                    System.out.println("1) view the list\r\n" +
                            "2) add an item\r\n" +
                            "3) edit an item\r\n" +
                            "4) remove an item\r\n" +
                            "5) save the current list\r\n" +
                            "6) quit to the main menu\r\n" +
                            "");

                    listOperation = sc.nextInt();

                    mainmenu =  performListOperation(listOperation);

                }
                break;

            }
            else if(mainMenuOption==2)
            {
                // view saved list
            }
            else if(mainMenuOption==3)
            {
                break;
            }
            else
            {
                System.out.println("Please select valid option");
            }

        }
    }

    public  boolean  performListOperation(int i)
    {
        switch(i)
        {
            case 1: this.contactList.ViewContacts();
                return false;

            case 2:  this.contactList.AddItemToList();
                return false;
            case 3: this.contactList.EditContacts();
                return false;
            case 4: this.contactList.removeContacts();
                return false;
            case 5: // save current item to list
                return false;
            case 6:
                return true;
            default:
                System.out.println("Please select valid option");
                return false;


        }
    }
}
