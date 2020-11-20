import java.io.Serializable;
import java.util.ArrayList;

public class TaskList {
    private ArrayList<TaskItem> itemList;
    private TaskItem item;

    public TaskList(){
        this.itemList = new ArrayList<TaskItem>();
    }

    public void addItem(TaskItem item) { this.itemList.add(item); }

    public void deleteItem(TaskItem item) { this.itemList.remove(item); }

    public int getListSize(){
        return itemList.size();
    }
    public String showList(int i) {
        String dueDate = itemList.get(i).getDueDate();
        String description = itemList.get(i).getDescription();
        String title = itemList.get(i).getTitle();

        return i + ") [" + dueDate + "] " + description + ": " + title;
    }
    public void modifyItem(int i, String title, String description, String dueDate) {
        itemList.get(i).setDueDate(dueDate);
        itemList.get(i).setTitle(title);
        itemList.get(i).setDescription(description);

    }

    public void setItemComplete(int i) { System.out.println(i);itemList.get(i).setComplete(true);  }
    public void setItemIncomplete(int i) { itemList.get(i).setComplete(false); }

    public TaskItem getItemFromList(int i){
        itemList.get(i);

        return null;
    }
    public boolean getItemComplete(int i){
        System.out.println(i);
       return itemList.get(i).isComplete();
    }
    @Override
    public String toString() {
        String s = "[" + item.getDueDate() + "] " + item.getTitle()
                + ": " + item.getDescription();
        return s;
    }

}
