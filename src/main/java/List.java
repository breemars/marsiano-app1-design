import java.util.ArrayList;

public class List {
    private double progress; //keep track of progress of task
    private int totalCompTasks; //total number of completed tasks
    private String name;
    private ArrayList<Task> tasks; //keeps track of the tasks

    //Sets name of task list
    //process and totalTasks is set to 0
    List(String name){}

    //creates new Task obj and adds to the tasks arraylist
    void addTask(String name, String desc, String date, boolean status){}

    //finds task in arraylist and deletes it
    void removeTask(String name){}

    //called when user marks off a task
    void updateProgressBarAdd(){}

    //called when user de-marks off a task
    void updateProgressBarMinus(){}

    //updates title of list
    void setTitle(String name){}

    //gets title of list
    String getTitle(){
        return "";
    }


}
