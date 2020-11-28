import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class TaskItem {
    private String dueDate;
    private String title;
    private String description;
    private boolean complete = false;

    public  TaskItem (boolean complete, String dueDate, String title, String description)throws Exception{
        try
        {
            LocalDate.parse(dueDate,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                            .withResolverStyle(ResolverStyle.STRICT)
            );
            if(!title.isEmpty())
            {
                this.title= title;
                this.description= description;
                this.complete = complete;
                this.dueDate= dueDate;

            }
            else
                throw new Exception("title is empty");


        }
        catch (DateTimeParseException e)
        {
            throw e;
        }
        catch(Exception ex)
        {
            throw ex;
        }

    }

    public   TaskItem (String dueDate, String title, String description) throws Exception{
        try
        {
            LocalDate.parse(dueDate,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                            .withResolverStyle(ResolverStyle.STRICT)
            );
            if(!title.isEmpty())
            {
                this.title= title;
                this.description= description;

                this.dueDate= dueDate;

            }
            else
                throw new Exception("title is empty");

        }
        catch (DateTimeParseException e)
        {
            throw e;
        }
        catch(Exception ex)
        {
            throw ex;
        }

    }
    public  TaskItem (String dueDate, String title){
        try
        {
            LocalDate.parse(dueDate,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                            .withResolverStyle(ResolverStyle.STRICT)
            );
            if(!title.isEmpty())
            {
                this.title= title;

                this.dueDate= dueDate;

            }

        }
        catch (DateTimeParseException e)
        {
            throw e;
        }

    }
    public TaskItem (){ }

    public String getTitle() { return title; }
    public String getDueDate() { return dueDate; }
    public String getDescription() { return description; }

    public boolean isComplete() {
        return complete;
    }

    public boolean setTitle(String title) {
        if(!title.isEmpty())
        {
            this.title = title;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean setDueDate(String dueDate) {
        try
        {
            LocalDate.parse(dueDate,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                            .withResolverStyle(ResolverStyle.STRICT)
            );

            this.dueDate= dueDate;
            return true;
        }
        catch (DateTimeParseException e)
        {
            return false;
        }


    }
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

    public boolean setComplete(boolean complete) { this.complete = complete;
        return complete;}

}


