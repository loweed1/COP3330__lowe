import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        while(true)
        {
            System.out.println("Select Your Application");
            System.out.println("------------------------");
            System.out.println("1) task list");
            System.out.println("2) contact list");
            System.out.println("3) quit");

            Scanner sc =new Scanner(System.in);
            int  s = sc.nextInt();
            if(s==1)
            {
                TaskApp c = new TaskApp();
                c.prinMainMenu();
            }
            else if(s==2)
            {
                ContactApp c = new ContactApp();
                c.prinMainMenu();
            }
            else if(s==3)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Please select valid option");
            }

        }

    }

}

