import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest {
    TaskList list= new TaskList();
    TaskItem item;
    @Test
    public void addingTaskItemsIncreasesSize(){

        item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
        assertEquals(0, list.getListSize());
        list.addItem(item);
        assertEquals(1, list.getListSize());

    }
    @Test
    public void completingTaskItemChangesStatus(){
        item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
       //assertEquals(false, item.isComplete());
        list.addItem(item);
        list.setItemComplete(0);
        System.out.println(list.getItemComplete(0));
        assertEquals(true , list.getItemComplete(0));

    }
    @Test
    public void completingTaskItemFailsWithInvalidIndex(){
        try{
            item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
            list.addItem(item);
            System.out.println(item);
            list.setItemComplete(1);
            System.out.println(list.getItemFromList(0));

        }
        catch(IndexOutOfBoundsException e){
            assertEquals(true , true);
        }
    }
    @Test
    public void editingTaskItemChangesValues(){
        item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
        list.modifyItem(0, "milk", "2020-11-01","white liquid in jug");

    }

    @Test
    public void editingTaskItemDescriptionChangesValue(){


    }
    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){

    }
    @Test
    public void editingTaskItemDueDateChangesValue(){

    }
    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemTitleChangesValue(){

    }
    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){

    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){

    }
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){

    }
    @Test
    public void newTaskListIsEmpty() {
        assertEquals(0, list.getListSize());

    }
    @Test
    public void removingTaskItemsDecreasesSize(){
        item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
        list.addItem(item);
        assertEquals(1, list.getListSize());
        list.deleteItem(item);
        assertEquals(0, list.getListSize());


    }
    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){
        item = new TaskItem("2020-11-24", "milk", "white liquid in jug");
        list.addItem(item);
        assertEquals(1, list.getListSize());
        list.deleteItem(item);
        assertEquals(2, list.getListSize());

    }
    @Test
    public void savedTaskListCanBeLoaded(){

    }
    @Test
    public void uncompletingTaskItemChangesStatus(){
    }


    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){

    }
}

