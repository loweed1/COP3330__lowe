import java.text.Format;

public class TaskItem {
    private String dueDate;
    private String title;
    private String description;
    private boolean complete = false;

    public TaskItem (boolean complete, String dueDate, String title, String description){
        this.dueDate= dueDate;
        this.title= title;
        this.description= description;
        this.complete = complete;
    }

    public TaskItem (String dueDate, String title, String description){
        this.dueDate= dueDate;
        this.title= title;
        this.description= description;
    }
    public TaskItem (String dueDate, String title){
        this.description= "";
        this.dueDate= dueDate;
        this.title= title;
    }
    public TaskItem (String dueDate){ this.dueDate= dueDate; }

    public String getTitle() { return title; }
    public String getDueDate() { return dueDate; }
    public String getDescription() { return description; }

    public boolean isComplete() {
        return complete;
    }

    public void setTitle(String title) { this.title = title; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {

        String b = "Task title: " + title +
                "\nTask description: " + description +
                "\nTask due date (YYYY-MM-DD): " + dueDate;
        return b;
    }

    public void setComplete(boolean complete) { this.complete= complete; }

}

