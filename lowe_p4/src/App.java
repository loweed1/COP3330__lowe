import java.util.Scanner;

public class App {
    private TaskList list;
    private TaskItem item;
    public void saveCurrentTaskList() { this.list = createTaskList(); }

    public void loadTaskList() {

    }
    public TaskList createTaskList(){ return new TaskList(); }

    public void addItemToList(String title, String description, String dueDate){
        item = new TaskItem(title, description, dueDate);
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

    public void printMainMenu() {
        System.out.println("1 create a new list");
        System.out.println("2 load an existing list");
        System.out.println("3 quit");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        switch (x) {
            case 1:
                System.out.println("New task list has been created");
                System.out.println();
                System.out.println("List Operations Menu");
                System.out.println("--------");
                boolean displayFunctions = true;
                while(displayFunctions) {
                    System.out.println("1 View current Task");
                    System.out.println("2 Add item to current task list");
                    System.out.println("3 Edit an item in the current task list");
                    System.out.println("4 Remove item from current task list");
                    System.out.println("5 mark an item in the current task list as completed");
                    System.out.println("6 unmark an item in the current task list as completed");
                    System.out.println("7 Save current task list");
                    System.out.println("8 quit to main menu");

                    int j = Integer.parseInt(sc.nextLine());
                    switch (j) {
                        case 1:
                            viewTaskList();
                            break;
                        case 2:
                            String title = sc.nextLine();
                            String description = sc.nextLine();
                            String dueDate = sc.nextLine();
                            addItemToList(title, description, dueDate);
                            break;
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
                            break;
                        case 4:
                            removeItem();
                            break;
                        case 5:

                            num = Integer.parseInt(sc.nextLine());
                            markItem(num);
                            break;
                        case 6:
                            num = Integer.parseInt(sc.nextLine());
                            unmarkItem(num);
                            break;
                        case 7:
                            saveCurrentTaskList();
                            break;
                        case 8:
                            displayFunctions= false;
                            break;
                    }//end of inner switch case
                } //end of while display function
                break;
            case 2:
                System.out.println("Task title: Task 1\n" +
                        "Task description: My first task\n" +
                        "Task due date (YYYY-MM-DD): 2020-01-01");
                break;
            case 3:
                break;

        }//end of outer switch

    }//end of mainmenu

    public static void main(String[] ignored)  {
        App app = new App();
        app.printMainMenu();
//

}
    public static void runOption(int choice){
        System.out.println("You chose option "+ choice);
    }


        public static void help(){
            System.out.println("- help : This help message");
            System.out.println("- list : List all the items/containers of your todo list");
            System.out.println("- save : Save the data to a local temporary file");
            System.out.println("- load : Load the data from a local temporary file");
            System.out.println("- add_item <ID> <NAME> : Add an item/container to your todo list");
            System.out.println(" <ID> = 0 if you want to add to the root level, otherwise, use " +
                    "the <ID> of a container you want to add to");
            System.out.println(" <NAME> (String) Is the name of the item you want to add. The " +
                    "string cannot contain empty 'spaces'. For example, 'some item' " +
                    "is not acceptable.");
            System.out.println("For example, to add an item named buy_milk to the root level, do: ");
            System.out.println(" add_item 0 buy_milk");
            System.out.println("");
            System.out.println("- add_container <ID> <NAME> : Add an item/container to your todo list");
            System.out.println(" <ID> = 0 if you want to add to the root level, otherwise, use " +
                    "the <ID> of a container you want to add to");
            System.out.println(" <NAME> (String) Is the name of the item you want to add. The " +
                    "string cannot contain empty 'spaces'. For example, 'some item' " +
                    "is not acceptable.");
            System.out.println("");
            System.out.println("- delete <ID> : Delete a container / item using an ID");
            System.out.printf("\n\n");
        }
}
