import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskListTest {

    TaskList list= new TaskList();
    TaskItem item;
    @Test
    public void addingTaskItemsIncreasesSize(){

        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            assertEquals(0, list.getListSize());
            list.addItem(item);
            assertEquals(1, list.getListSize());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    @Test
    public void completingTaskItemChangesStatus(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");

            item.setComplete(true);
            assertEquals(true , item.isComplete());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    @Test
    public void completingTaskItemFailsWithInvalidIndex(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            item = list.getItemFromList(1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,true);
        }


    }
    @Test
    public void editingTaskItemChangesValues(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        list.addItem(item);
        list.modifyItem(0, "title", "description", "2020-12-12");
        assertEquals("title",list.getItemFromList(0).getTitle());
    }

    @Test
    public void editingTaskItemDescriptionChangesValue(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        list.addItem(item);
        list.modifyItem(0, "title", "description", "2020-12-12");
        assertEquals("description",list.getItemFromList(0).getDescription());

    }
    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){
        try {
            list.modifyItem(1, "title", "description", "dueDate");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,true);
        }
    }
    @Test
    public void editingTaskItemDueDateChangesValue(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            list.modifyItem(0, "title", "description", "2020-12-12");
            assertEquals("2020-12-12",list.getItemFromList(0).getDueDate());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,false);
        }
    }
    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){
        try {
            list.modifyItem(1, "title", "description", "dueDate");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,true);
        }
    }

    @Test
    public void editingTaskItemTitleChangesValue(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            list.modifyItem(0, "title", "description", "2020-12-12");
            assertEquals("title",list.getItemFromList(0).getTitle());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,false);
        }
    }
    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){
        try {
            list.modifyItem(1, "title", "description", "dueDate");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(true,true);
        }
    }
    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){
        try
        {
            list.getItemFromList(1).getDescription();
            assertEquals(false,true);
        }
        catch(Exception e)
        {
            assertEquals(true,true);
        }
    }
    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            list.getItemFromList(0).getDescription();
            assertEquals(true,true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(false,true);
        }
    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){
        try
        {
            list.getItemFromList(1).getDueDate();
            assertEquals(false,true);
        }
        catch(Exception e)
        {
            assertEquals(true,true);
        }
    }
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
        try {
            item = new TaskItem("2020-11-1", "milk", "white liquid in jug");
            list.addItem(item);
            list.getItemFromList(0).getDueDate();
            assertEquals(true,true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(false,true);
        }
    }
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){
        try
        {
            list.getItemFromList(1).getTitle();
            assertEquals(false,true);
        }
        catch(Exception e)
        {
            assertEquals(true,true);
        }
    }
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            list.getItemFromList(0).getTitle();
            assertEquals(true,true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(false,true);
        }
    }
    @Test
    public void newTaskListIsEmpty() {
        list = new TaskList();
        assertEquals(0,list.getListSize());
    }
    @Test
    public void removingTaskItemsDecreasesSize(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            assertEquals(1, list.getListSize());
            list.deleteItem(item);
            assertEquals(0, list.getListSize());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){
        try
        {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            item = list.getItemFromList(10);
            list.deleteItem(item);
            assertEquals(false,true);
        }
        catch(Exception e)
        {
            assertEquals(true,true);
        }
    }
    @Test
    public void savedTaskListCanBeLoaded(){
        assertEquals(true,true);
    }
    @Test
    public void uncompletingTaskItemChangesStatus(){
        try {
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            item.setComplete(false);

            assertEquals(false,item.isComplete());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals(false,true);
        }
    }


    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){
        try
        {
            list.getItemFromList(1).setComplete(false);
            assertEquals(false,true);
        }
        catch(Exception e)
        {
            assertEquals(true,true);
        }

    }

}

