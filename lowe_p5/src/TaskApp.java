import java.util.Scanner;

public class TaskApp {
    Scanner sc =new Scanner(System.in);
    private int mainMenuOption;
    public TaskApp()
    {

    }
    TaskList list=new TaskList();
    TaskItem item = new TaskItem();
    public void prinMainMenu()
    {
        while(true)
        {

            System.out.println("Main Menu");
            System.out.println("------------------------");
            System.out.println("1)create a new list");
            System.out.println("2)load an existing list");
            System.out.println("3) quit");

            int  mainMenuOption = sc.nextInt();
            if(mainMenuOption==1)
            {
                System.out.println("New task list has been created");
                System.out.println();

                int listOperation;
                boolean mainmenu =false;
                while(!mainmenu)
                {
                    System.out.println("1 View current Task");
                    System.out.println("2 Add item to current task list");
                    System.out.println("3 Edit an item in the current task list");
                    System.out.println("4 Remove item from current task list");
                    System.out.println("5 mark an item in the current task list as completed");
                    System.out.println("6 unmark an item in the current task list as completed");
                    System.out.println("7 Save current task list");
                    System.out.println("8 quit to main menu");

                    listOperation = sc.nextInt();

                    mainmenu =  performListOperation(listOperation);
                }

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
    public  boolean  performListOperation(int j)
    {

        switch (j) {
            case 1:
                viewTaskList();
                return false;
            case 2:
                String title = sc.nextLine();
                String description = sc.nextLine();
                String dueDate = sc.nextLine();
                addItemToList(title, description, dueDate);
                return false;
            case 3:
                System.out.println("Which task will you edit?");
                int num = Integer.parseInt(sc.nextLine());
                System.out.println("Enter a new title for task " + num);
                title = sc.nextLine();
                System.out.println("Enter a new description for task " + num);
                description = sc.nextLine();
                System.out.println("Enter a new task due date (YYYY-MM-DD) for task " + num);
                dueDate = sc.nextLine();
                editItem(num, title, description, dueDate);
                return false;
            case 4:
                removeItem();
                return false;
            case 5:

                num = Integer.parseInt(sc.nextLine());
                markItem(num);
                return false;
            case 6:
                num = Integer.parseInt(sc.nextLine());
                unmarkItem(num);
                return false;
            case 7:
                saveCurrentTaskList();
                return false;
            case 8:
                return true;
            default :
                System.out.println("invalid choice");
                return false;

        }

    }
    public void saveCurrentTaskList() { this.list = createTaskList(); }

    public void loadTaskList() {

    }
    public TaskList createTaskList(){ return new TaskList(); }

    public void addItemToList(String title, String description, String dueDate){
        try {
            item = new TaskItem(title, description, dueDate);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Title is emptuy or duedate is not valid");
        }
        list.addItem(item);
    }

    public void editItem(int num, String title, String description, String dueDate){
        for (int i = 0; i < list.getListSize(); i++) {
            list.showList(i);
            if (list.showList(i).charAt(0) == num) {
                list.modifyItem(num,title,description,dueDate);
            }
        }
    }

    public void removeItem(){ list.deleteItem(item); }

    public void markItem(int num){
        list.setItemComplete(num);
    }

    public void unmarkItem(int num){
        list.setItemIncomplete(num);
    }
    public void viewTaskList(){
        for (int i = 0; i < list.getListSize(); i++) {
            list.showList(i);
        }
    }

}

