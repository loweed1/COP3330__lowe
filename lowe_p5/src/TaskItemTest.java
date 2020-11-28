import static org.junit.jupiter.api.Assertions.*;

import java.time.format.DateTimeParseException;

import org.junit.jupiter.api.Test;

class TaskItemTest {
    TaskItem item = new TaskItem();
    @Test
    public void creatingTaskItemFailsWithInvalidDueDate() {
        try {
            new TaskItem("Task1","desc","duedate");
            assertEquals(true,false);
        } catch (DateTimeParseException e) {
            // TODO Auto-generated catch block
            assertEquals(true,true);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,false);
        }
    }
    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        try {
            new TaskItem("2020-11-1","","duedate");
            assertEquals(true,false);
        } catch (DateTimeParseException e) {
            // TODO Auto-generated catch block
            assertEquals(true,false);

        } catch (Exception e) {
            // TODO Auto-generated catch block

            assertEquals(true,true);
        }
    }
    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
        try {
            new TaskItem("2020-12-12","12/12/2020","12/12/2020");
            assertEquals(true,true);
        } catch (DateTimeParseException e) {
            // TODO Auto-generated catch block
            assertEquals(true,false);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            assertEquals(true,false);
        }
    }
    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){

        try {
            new TaskItem("2020-12-12","title","22/12/2020");
            assertEquals(true,true);
        } catch (DateTimeParseException e) {
            // TODO Auto-generated catch block
            assertEquals(true,false);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            assertEquals(true,false);
        }
    }
    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){
        assertEquals(false,item.setDueDate("duedate"));
    }
    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        assertEquals(false,item.setDueDate("2020-12-2020"));
    }
    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){
        assertEquals(false,item.setTitle(""));
    }
    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){
        assertEquals(true,item.setTitle("title"));
    }
}

